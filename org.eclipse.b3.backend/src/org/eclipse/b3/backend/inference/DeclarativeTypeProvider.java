/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.b3.backend.core.B3Debug;
import org.eclipse.b3.backend.core.adapters.TypeAdapter;
import org.eclipse.b3.backend.core.adapters.TypeAdapterFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.util.Exceptions;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;

import com.google.inject.Inject;
import com.google.inject.internal.Lists;

/**
 * Basic implementation of ITypeProvider.
 * 
 */
public class DeclarativeTypeProvider implements ITypeProvider, ITypeSchemeVariableProvider {
	protected static class TypeInfo implements ITypeInfo {
		private Type type;

		boolean lval;

		boolean settable;

		boolean eobj;

		public TypeInfo(Type t, boolean lval, boolean settable) {
			this(t, lval, settable, false);
		}

		public TypeInfo(Type t, boolean lval, boolean settable, boolean eobj) {
			this.type = t;
			this.lval = lval;
			this.settable = settable;
			this.eobj = eobj;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.b3.backend.inference.ITypeInfo#getType()
		 */
		public Type getType() {
			return type;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.b3.backend.inference.ITypeInfo#isEObject()
		 */
		public boolean isEObject() {
			return eobj;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.b3.backend.inference.ITypeInfo#isLValue()
		 */
		public boolean isLValue() {
			return lval;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.b3.backend.inference.ITypeInfo#isSettable()
		 */
		public boolean isSettable() {
			return settable;
		}

	}

	private static final Logger log = Logger.getLogger(DeclarativeTypeProvider.class);

	private final PolymorphicDispatcher<Object> typeDispatcher = new PolymorphicDispatcher<Object>(
		"type", 1, 1, Collections.singletonList(this), new ErrorHandler<Object>() {
			public Object handle(Object[] params, Throwable e) {
				return handleError(params, e);
			}
		});

	private final PolymorphicDispatcher<List<ITypeConstraint>> tcDispatcher = new PolymorphicDispatcher<List<ITypeConstraint>>(
		"tc", 1, 1, Collections.singletonList(this), new ErrorHandler<List<ITypeConstraint>>() {
			public List<ITypeConstraint> handle(Object[] params, Throwable e) {
				return handleTcError(params, e);
			}
		});

	private final PolymorphicDispatcher<B3FunctionType> signatureDispatcher = new PolymorphicDispatcher<B3FunctionType>(
		"signature", 1, 3, Collections.singletonList(this), new ErrorHandler<B3FunctionType>() {
			public B3FunctionType handle(Object[] params, Throwable e) {
				return handleFuncTypeError(params, e);
			}
		});

	private final PolymorphicDispatcher<Type> constraintDispatcher = new PolymorphicDispatcher<Type>(
		"constraint", 3, 3, Collections.singletonList(this), new ErrorHandler<Type>() {
			public Type handle(Object[] params, Throwable e) {
				return handleTypeError(params, e);
			}
		});

	private final PolymorphicDispatcher<ITypeInfo> typeInfoDispatcher = new PolymorphicDispatcher<ITypeInfo>(
		"typeInfo", 1, 1, Collections.singletonList(this), new ErrorHandler<ITypeInfo>() {
			public ITypeInfo handle(Object[] params, Throwable e) {
				return handleITypeError(params, e);
			}
		});

	private final PolymorphicDispatcher<Object> varScopeDispatcher = new PolymorphicDispatcher<Object>(
		"varScope", 1, 1, Collections.singletonList(this), new ErrorHandler<Object>() {
			public Object handle(Object[] params, Throwable e) {
				return handleError(params, e);
			}
		});

	private List<Object> inferenceStack = new ArrayList<Object>();

	private List<Object> signatureStack = new ArrayList<Object>();

	@Inject
	protected ITypeScheme ts;

	public Type constraint(EObject parent, EObject element, EStructuralFeature feature) {
		return null;
	}

	/**
	 * Returns a type in the (parent) containment that contains the type constraint for an element.
	 * Null may be returned if there is no such constraint.
	 * 
	 * @param element
	 * @return
	 */
	public Type doGetConstraint(EObject element) {
		return constraintDispatcher.invoke(element.eContainer(), element, element.eContainingFeature());
	}

	public Type doGetConstraint(EObject parent, EObject element, EStructuralFeature feature) {
		return constraintDispatcher.invoke(parent, element, feature);
	}

	public Type doGetInferredType(Object element) {
		// // speed up inference by associating result with element in an adapter
		Type type = getTypeAdapterType(element);
		if(type != null)
			return type;

		if(inferenceStack.contains(element)) {
			if(B3Debug.typer)
				B3Debug.trace("Inference of element depends on itself: ", element.getClass().getName(), ", :", element);
			return null; // inference depends on itself
		}
		try {
			inferenceStack.add(element);
			type = (Type) typeDispatcher.invoke(element);
			setTypeAdapterType(element, type);
			if(type != null)
				return type;
			if(B3Debug.typer)
				B3Debug.trace(
					"b3 type provider: null result for doGetInferredType() for element of type: ",
					element.getClass().getName());
			return null;
		}
		finally {
			inferenceStack.remove(element);
		}
	}

	public B3FunctionType doGetSignature(Object element) {
		// speed up inference by associating result with element in an adapter
		TypeAdapter ta = (element instanceof EObject)
				? TypeAdapterFactory.eINSTANCE.adapt((EObject) element)
				: null;
		B3FunctionType type = null;
		if(ta != null && (type = (B3FunctionType) ta.getAssociatedType(signatureDispatcher)) != null)
			return type;

		if(signatureStack.contains(element)) {
			if(B3Debug.typer)
				B3Debug.trace(
					"Inference of element's signature depends on itself: ", element.getClass(), ", :", element);
			return null; // inference depends on itself
		}
		try {
			signatureStack.add(element);
			type = signatureDispatcher.invoke(element);
			if(type != null) {
				if(ta != null)
					ta.setAssociatedType(signatureDispatcher, type);
				return type;
			}
			if(B3Debug.typer)
				B3Debug.trace(
					"b3 type provider: null result for doGetSignature() for element of type: ",
					element.getClass().getName());

			return null;
		}
		finally {
			signatureStack.remove(element);
		}
	}

	public List<ITypeConstraint> doGetTc(EObject element) {
		if(ts.getParent() == null)
			ts.setParent(this);
		return tcDispatcher.invoke(element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.backend.inference.ITypeProvider#doGetTypeInfo(java.lang.Object)
	 */
	public ITypeInfo doGetTypeInfo(Object element) {
		return typeInfoDispatcher.invoke(element);
	}

	// Returns the "var scope" of an object, which is either the scope it is defined it (if it is a variable)
	// or the top level container of expression if it is some type of Function
	public Object doGetVarScope(Object element) {
		return varScopeDispatcher.invoke(element);
	}

	public Type getTypeAdapterType(Object element) {
		if(!(element instanceof EObject))
			return null;
		TypeAdapter ta = TypeAdapterFactory.eINSTANCE.adapt((EObject) element);
		return ta.getAssociatedType(typeDispatcher);
	}

	public ITypeExpression getTypeAdapterTypeExpression(Object element) {
		if(!(element instanceof EObject))
			return null;
		TypeAdapter ta = TypeAdapterFactory.eINSTANCE.adapt((EObject) element);
		return ta.getAssociatedTypeExpression(typeDispatcher);
	}

	/**
	 * Returns they key (this) for all variables.
	 */
	public Object getVariableKey(EObject var) {
		return this;
	}

	public void setTypeAdapterType(Object element, Type type) {
		if(!(element instanceof EObject))
			return;
		TypeAdapter ta = TypeAdapterFactory.eINSTANCE.adapt((EObject) element);
		ta.setAssociatedType(typeDispatcher, type);
	}

	public void setTypeAdapterTypeExpression(Object element, ITypeExpression typeExpr) {
		if(!(element instanceof EObject))
			return;
		TypeAdapter ta = TypeAdapterFactory.eINSTANCE.adapt((EObject) element);
		ta.setAssociatedTypeExpression(typeDispatcher, typeExpr);
	}

	public B3FunctionType signature(Object o) {
		throw new UnsupportedOperationException("No suitable method for 'signature' of :" + o.getClass());
	}

	public Type type(Object o) {
		if(B3Debug.typer)
			B3Debug.trace("b3 type provider: Default type inference type(Object o)=>", o.getClass());
		return o.getClass();
	}

	/**
	 * This default information returns a ITypeInfo with the result of {@link #doGetInferredType(Object)} and lvalue = false, and settable = false.
	 * 
	 * @param o
	 * @return
	 */
	public ITypeInfo typeInfo(Object o) {
		return new TypeInfo(doGetInferredType(o), false, false);
	}

	/**
	 * Objects that are not variables nor a container does not have a var scope and null is returned.
	 * 
	 * @param o
	 * @return
	 */
	public Object varScope(Object o) {
		return null;
	}

	protected B3FunctionType getAssociatedSignature(Object element) {
		TypeAdapter ta = (element instanceof EObject)
				? TypeAdapterFactory.eINSTANCE.adapt((EObject) element)
				: null;
		B3FunctionType type = null;
		if(ta != null && (type = (B3FunctionType) ta.getAssociatedType(signatureDispatcher)) != null)
			return type;
		return null;

	}

	protected Type getAssociatedType(Object element) {
		TypeAdapter ta = (element instanceof EObject)
				? TypeAdapterFactory.eINSTANCE.adapt((EObject) element)
				: null;
		Type type = ta != null
				? (Type) ta.getAssociatedType(typeDispatcher)
				: null;
		return type;

	}

	protected Object handleError(Object[] params, Throwable e) {
		// TODO: don't know how this is supposed to work - callers should expect a type at all times,
		// and get a "type can not be inferred exception" with some info about why.
		//
		if(e instanceof NullPointerException) {
			if(B3Debug.typer)
				B3Debug.trace(
					"b3 type provider: Default error handler type inference type(Object o)=>Object.class was used for:",
					params[0].getClass());

			return Object.class;
		}
		return Exceptions.throwUncheckedException(e);
	}

	protected B3FunctionType handleFuncTypeError(Object[] params, Throwable e) {
		return Exceptions.throwUncheckedException(e);
	}

	protected ITypeInfo handleITypeError(Object[] params, Throwable e) {
		return null;
	}

	protected List<ITypeConstraint> handleTcError(Object[] params, Throwable e) {
		if(B3Debug.typer)
			B3Debug.trace("b3 tc provider: Error handler was used for:", params[0].getClass());
		return Lists.newArrayList(); // empty list
	}

	protected Type handleTypeError(Object[] params, Throwable e) {
		return null;
	}

	/**
	 * Sets the associated type for an element (i.e. modifies the cached inference).
	 * If element is not an EObject the call has no effect.
	 * 
	 * @param element
	 * @param type
	 */
	protected void setAssociatedType(Object element, Type type) {
		TypeAdapter ta = (element instanceof EObject)
				? TypeAdapterFactory.eINSTANCE.adapt((EObject) element)
				: null;

		if(ta != null)
			ta.setAssociatedType(typeDispatcher, type);
	}
}
