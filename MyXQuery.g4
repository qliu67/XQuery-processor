grammar MyXQuery;

ap:	'doc' '(' filename ')' '/' rp		# ApChildren
|	'doc' '(' filename ')' '//' rp		# ApFindAll
;

filename: FILENAME;

rp: NAME			# Name
|	STAR			# Wildcard
|	DOT				# CurrentDir
|	DOTDOT			# ParentDir
|	TEXT			# Text
|	'@' NAME		# Attribute
|	'(' rp ')'		# RpParentheses
|	rp '/' rp		# RpChildren
|	rp '//' rp		# RpFindAll
|	rp '[' f ']'	# RpFilter
|	rp ',' rp		# RpDouble
;

f:	rp				# RpExists
|	rp '=' rp		# Equal
|	rp 'eq' rp		# Equal
|	rp '==' rp		# Is
|	rp 'is' rp		# Is
|	'(' f ')'		# FParentheses
|	f 'and' f		# FAndF
|	f 'or' f		# FOrF
|	'not' f			# NotF
;

xq:	var														# Variable
|	stringConst												# MakeText
|	ap														# AbsolutePath
|	'(' xq ')'												# XQParentheses
|	xq '/' rp												# XQChildren
|	xq '//' rp												# XQFindAll
|	xq ',' xq												# XQDouble
|	'<' NAME '>' '{' xq '}' '</' NAME '>'					# MakeElem
|	forClause (letClause | ) (whereClause | ) returnClause	# FLWR
|	letClause xq											# LetXQ
|	'join' '(' xq ',' xq ',' attList ',' attList ')'		# Join
;

stringConst: STRING;
attList: '[' NAME ? (',' NAME)* ']';

forClause: 'for' var 'in' xq (',' var 'in' xq)*;
letClause: 'let' var ':=' xq (',' var ':=' xq)*;
whereClause: 'where' cond;
returnClause: 'return' xq;

cond:	xq '=' xq												# XQEqual
|		xq 'eq' xq												# XQEqual
|		xq '==' xq												# XQIs
|		xq 'is' xq												# XQIs
|		'empty' '(' xq ')'										# XQEmpty
|		'some' var 'in' xq (',' var 'in' xq)* 'satisfies' cond	# SomeSatisfies
|		'(' cond ')'											# CondParentheses
|		cond 'and' cond											# CondAndCond
|		cond 'or' cond											# CondOrCond
|		'not' cond												# NotCond
;

var: '$' NAME;

FILENAME	: '"' [a-zA-Z0-9_]+ '.xml"'  ;
STRING		: '"' [a-zA-Z0-9~!@#$%^&*()=+._ -]+ '"';
NAME		: [a-zA-Z0-9-]+           ;
STAR		: '*'        ;
DOT			: '.'        ;
DOTDOT		: '..'       ;
TEXT		: 'text()'   ;

WS: [ \n\t\r]+ -> skip;