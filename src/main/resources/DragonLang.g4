grammar DragonLang ;

start : RT* line (RT+ line)* RT* EOF;

line : expr                       #lineExpr
      |RETURN expr?               #lineReturn
      |(POINT|DOLLAR)? WORD function    #lineFunc
      |ifexpr                     #lineIf
      |name=WORD(COLON WORD(COMMA WORD)*)? object  #lineClass
      |LOOP BRACKET_LEFT (loopInit SEMICOLON)? loopJudge (SEMICOLON loopIncrease)? BRACKET_RIGHT loopBlock # lineLoop
      |CONTINUE                    #lineContinue
      |BREAK                  #lineBreak
      |(var  EQUAL )? var COLON (expr (COMMA expr)*)? #lineRawCall
      |(var  EQUAL )? expr arrowPart+   #lineArrow
      ;

loopInit : expr;
loopJudge : expr ;
loopIncrease : expr ;
loopBlock : blockInKH;

callParam : RT* COMMA RT* expr;
callBody : BRACKET_LEFT RT* (expr callParam*)? RT* BRACKET_RIGHT ;

arrowPart : ARROW var callBody? ;

expr : var                          #exprVar
    | object                        #exprObject
    | array                         #exprArray
    | function                      #exprFunction
    | expr callBody                 #exprCall
    | STRING                        #exprString
    | NUMBER                        #exprNumber
    | TRUE                          #exprTrue
    | FALSE                         #exprFalse
    | NULL                          #exprNull
    | MINUS_SIGN expr               #exprNagative
    | var PLUS_ONE                  #exprPlusOne
    | var MINUS_ONE                 #exprMinusOne
    | expr ( mul=MULTIPLICATION |  div=DIVISION | rmd=PERCENT  ) expr #exprMulDivRmd
    | expr ( add=PLUS_SIGN | sub=MINUS_SIGN ) expr       #exprAddSubtract
    | expr GREATER_THAN RT* expr    #exprGreaterThan
    | expr GREATER_EQUAL RT* expr   #exprGreaterEqual
    | expr LESS_THAN RT* expr       #exprLessThan
    | expr LESS_EQUAL RT* expr      #exprLessEqual
    | expr EQUAL_EQUAL RT* expr     #exprEqualEqual
    | expr NOT_EUQAL RT* expr       #exprNotEqual
    | EXCLAMATION expr              #exprNot
    | expr AND_SIGN AND_SIGN RT* expr        #exprAnd
    | expr OR_SIGN RT* expr         #exprOr
    | var  EQUAL RT* expr           #exprAssign
    | var  PLUS_ASSIGN RT* expr     #exprAddAssign
    | var  MINUS_ASSIGN RT* expr    #exprSubtractAssign
    | BRACKET_LEFT RT* expr RT* BRACKET_RIGHT #exprBracket
    | expr otherExpr  #exprAndSub
    | expr varGetter+ #exprAndGetter
     ;

otherExpr : VERTICAL_BAR expr;

ifexpr : IF expr ifBlockInKH elseif* otherelse? ;
elseif : ELSEIF expr ifBlockInKH;
otherelse : ELSE ifBlockInKH ;
function : params blockInKH ;
ifBlockInKH : blockInKH ;
blockInKH : BRACE_LEFT line? (RT line?)* RT* BRACE_RIGHT ;
params : BRACKET_LEFT RT* ( param (RT* COMMA RT* param)* )? RT* BRACKET_RIGHT ;
param : WORD (EQUAL expr)? ;

array : SQUARE_LEFT RT* ( expr arraySub* )?  RT* SQUARE_RIGHT ;
arraySub : RT* COMMA RT* expr;

object : BRACE_LEFT RT* ( (pair|objectFunc) objectSub* )?  RT* BRACE_RIGHT ;
objectSub:  (COMMA RT*|RT+) (pair|objectFunc) ;

pair : WORD RT* (COLON RT* expr)? ;
objectFunc : WORD params blockInKH ;

var : ((POINT|DOLLAR)? WORD | NUMBER) varGetter*;
varGetter: POINT WORD                     #varPoint
         |SQUARE_LEFT expr? SQUARE_RIGHT  #varIndex
         ;

NUMBER : [1-9][0-9]*
       |'0'
       | ([0-9]+[.][0-9]+) ;

STRING : '"' ANYCHAR1* '"' | '“' ANYCHAR2* '”' | AT_SIGN WORD;
fragment ANYCHAR1 : ~[\r\n"] ;
fragment ANYCHAR2 : ~[\r\n“”] ;

NULL: 'null' | '空';
IF : 'if' | '如果';
ELSEIF : 'elseif' | '否则如果';
ELSE : 'else' | '否则';
RETURN : 'return'|'返回' ;
TRUE : 'true'|'是' ;
FALSE : 'false'|'否' ;

LOOP : 'for' | '循环';
CONTINUE : 'continue' | '跳过' ;
BREAK : 'break' | '中断' ;

ARROW : GREATER_THAN GREATER_THAN | '》' ;

GREATER_EQUAL : GREATER_THAN EQUAL;
LESS_EQUAL : LESS_THAN EQUAL;
EQUAL_EQUAL : EQUAL EQUAL;
NOT_EUQAL : EXCLAMATION EQUAL;
OR_SIGN : VERTICAL_BAR VERTICAL_BAR;

PLUS_ASSIGN : PLUS_SIGN EQUAL;
PLUS_ONE : PLUS_SIGN PLUS_SIGN;
MINUS_ASSIGN : MINUS_SIGN EQUAL ;
MINUS_ONE : MINUS_SIGN MINUS_SIGN ;

WORD : STARTCHAR NORMALCHAR* ;
fragment STARTCHAR :  ~[ \t\r\n\u000C+-/*%&|!=:;\u002e\u002c(){}<>\u005B\u005D"@$＋－×÷％＆｜！＝：；。，（）｛｝［］【】《》﹤﹥＜＞“”＠￥0-9] ;
fragment NORMALCHAR : ~[ \t\r\n\u000C+-/*%&|!=:;\u002e\u002c(){}<>\u005B\u005D"@$＋－×÷％＆｜！＝：；。，（）｛｝［］【】《》﹤﹥＜＞“”＠￥] ;



GREATER_THAN : '>' | '﹥' | '＞' ;
LESS_THAN : '<' | '﹤' | '＜' ;
PLUS_SIGN  : '+' | '＋';
MINUS_SIGN : '-' | '－' ;
MULTIPLICATION: '*' | '×';
DIVISION       : '/' | '÷';
PERCENT      : '%' | '％';
AND_SIGN     : '&' | '＆';
VERTICAL_BAR : '|' | '｜';
EXCLAMATION  : '!' | '！';
EQUAL        : '=' | '＝';
COLON        : ':' | '：';
SEMICOLON    : ';' | '；';
POINT        : '.' | '。';
COMMA        : ','| '，' ;
BRACKET_LEFT : '(' | '（' ;
BRACKET_RIGHT: ')' | '）' ;
BRACE_LEFT   : '{' | '｛';
BRACE_RIGHT  : '}' | '｝';
SQUARE_LEFT  : '[' | '［' | '【';
SQUARE_RIGHT : ']' | '］' | '】';
QUOTATION_LEFT  : '“' | '"';
QUOTATION_RIGHT : '”' | '"';
AT_SIGN         : '@' | '＠';
DOLLAR          : '$' | '￥' ;

WS  :  [ \t\u000C]+ -> skip ;
RT  :  [\r\n]+ ;

COMMENT    :   '/*' .*? '*/' -> channel(HIDDEN) ;
LINE_COMMENT :   '//' ~[\r\n]* -> channel(HIDDEN) ;