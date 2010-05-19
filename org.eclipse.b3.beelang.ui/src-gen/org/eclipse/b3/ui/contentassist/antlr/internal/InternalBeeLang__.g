lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T16 : 'unit' ;
T17 : 'latest' ;
T18 : 'timestamp' ;
T19 : 'default' ;
T20 : '=' ;
T21 : '+=' ;
T22 : '-=' ;
T23 : '*=' ;
T24 : '/=' ;
T25 : '%=' ;
T26 : '~=' ;
T27 : '==' ;
T28 : '===' ;
T29 : '!=' ;
T30 : '!==' ;
T31 : '>=' ;
T32 : '<=' ;
T33 : '>' ;
T34 : '<' ;
T35 : 'var' ;
T36 : '+' ;
T37 : '-' ;
T38 : '*' ;
T39 : '/' ;
T40 : '%' ;
T41 : '!' ;
T42 : '++' ;
T43 : '--' ;
T44 : 'input' ;
T45 : 'output' ;
T46 : 'source' ;
T47 : 'properties' ;
T48 : 'builder' ;
T49 : 'this' ;
T50 : '?' ;
T51 : 'true' ;
T52 : 'false' ;
T53 : '[' ;
T54 : '(' ;
T55 : ']' ;
T56 : ')' ;
T57 : 'super' ;
T58 : '.' ;
T59 : '@' ;
T60 : '$' ;
T61 : '&' ;
T62 : ':' ;
T63 : 'revision' ;
T64 : 'tag' ;
T65 : 'fail-modified' ;
T66 : 'keep-modified' ;
T67 : 'merge-modified' ;
T68 : 'no-update' ;
T69 : 'replace-modified' ;
T70 : 'public' ;
T71 : 'private' ;
T72 : 'parallel' ;
T73 : 'sequential' ;
T74 : 'repositories' ;
T75 : '{' ;
T76 : '}' ;
T77 : 'import' ;
T78 : ';' ;
T79 : 'as' ;
T80 : 'version' ;
T81 : 'implements' ;
T82 : ',' ;
T83 : 'provides' ;
T84 : 'requires' ;
T85 : 'env' ;
T86 : 'containers' ;
T87 : 'when' ;
T88 : 'requires-min' ;
T89 : 'requires-max' ;
T90 : 'min-required' ;
T91 : 'max-required' ;
T92 : 'extends' ;
T93 : 'annotations' ;
T94 : 'with' ;
T95 : 'concern' ;
T96 : '#' ;
T97 : 'precondition' ;
T98 : 'postinputcondition' ;
T99 : 'postcondition' ;
T100 : 'connection' ;
T101 : 'branches' ;
T102 : 'options' ;
T103 : 'update-policy' ;
T104 : 'include' ;
T105 : 'exclude' ;
T106 : 'repository' ;
T107 : 'resolution' ;
T108 : 'select-first' ;
T109 : 'select-best' ;
T110 : 'select-switch' ;
T111 : 'endswitch' ;
T112 : 'case' ;
T113 : 'container' ;
T114 : 'agent' ;
T115 : 'function' ;
T116 : '=>' ;
T117 : 'cached' ;
T118 : '||' ;
T119 : '&&' ;
T120 : 'context' ;
T121 : 'proceed' ;
T122 : '_' ;
T123 : 'throw' ;
T124 : 'try' ;
T125 : 'endtry' ;
T126 : 'finally' ;
T127 : 'catch' ;
T128 : 'switch' ;
T129 : 'if' ;
T130 : 'then' ;
T131 : 'endif' ;
T132 : 'else' ;
T133 : 'elseif' ;
T134 : 'new' ;
T135 : '|' ;
T136 : 'null' ;
T137 : 'reexport' ;
T138 : 'greedy' ;
T139 : 'final' ;
T140 : 'mutable' ;
T141 : '...' ;
T142 : 'val' ;
T143 : 'instanceof' ;
T144 : '..' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55903
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55905
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55907
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55909
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55911
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55913
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55915
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55917
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55919
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55921
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55923
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55925
RULE_ANY_OTHER : .;


