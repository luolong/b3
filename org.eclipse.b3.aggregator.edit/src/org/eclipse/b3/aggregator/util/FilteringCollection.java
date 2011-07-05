/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.aggregator.util;

import java.util.Collection;
import java.util.Iterator;

/**
 * A collection delegating all of its functionality to an underlying collection.
 * Useful for implementing filtering collections.
 * 
 * @author michal.ruzicka@cloudsmith.com
 */
public class FilteringCollection<E> implements Collection<E> {

	protected Collection<E> delegate;

	protected FilteringCollection() {
	}

	public FilteringCollection(Collection<E> delegate) {
		setDelegate(delegate);
	}

	public boolean add(E e) {
		return delegate.add(e);
	}

	/* call the single argument method in a loop to simplify overriding */
	public boolean addAll(Collection<? extends E> c) {
		boolean result = false;
		for(E e : c) {
			if(delegate.add(e) && !result)
				result = true;
		}
		return result;
	}

	public void clear() {
		delegate.clear();
	}

	public boolean contains(Object o) {
		return delegate.contains(o);
	}

	public boolean containsAll(Collection<?> c) {
		return delegate.containsAll(c);
	}

	public boolean isEmpty() {
		return delegate.isEmpty();
	}

	public Iterator<E> iterator() {
		return delegate.iterator();
	}

	public boolean remove(Object o) {
		return delegate.remove(o);
	}

	public boolean removeAll(Collection<?> c) {
		return delegate.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return delegate.retainAll(c);
	}

	public FilteringCollection<E> setDelegate(Collection<E> delegate) {
		if(this.delegate != null)
			throw new IllegalStateException();
		if(delegate == null)
			throw new NullPointerException();
		this.delegate = delegate;
		return this;
	}

	public int size() {
		return delegate.size();
	}

	public Object[] toArray() {
		return delegate.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return delegate.toArray(a);
	}

}