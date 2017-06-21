import java_cup.runtime.*;
%%
%class Lexer
%line
%column
%cup
%{   
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    private void Semita(int a, int b){
        int c = a+b;
    }
    int asd=42;
%}
LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\f]
dec_int_lit = 0 | [1-9][0-9]*
dec_int_id = [A-Za-z_][A-Za-z_0-9]*
%%
<YYINITIAL> {
    ";"                { return symbol(sym.SEMI); }
    ","                { return symbol(sym.COMMA); }
    "+"                {  return symbol(sym.PLUS); }
    "-"                {  return symbol(sym.MINUS); }
    "*"                {  return symbol(sym.TIMES); }
    "/"                {  return symbol(sym.DIVIDE); }
    "("                {  return symbol(sym.LPAREN); }
    ")"                {  return symbol(sym.RPAREN); }
    "="                 { return symbol(sym.EQUALS); }
    "purinto"                 { return symbol(sym.PRINT); }
    "if"                { return symbol(sym.IF); }
    "else"              { return symbol(sym.ELSE); }
    "{"                 { return symbol(sym.LCURLY); }
    "}"                 { return symbol(sym.RCURLY); }
    "while"             { return symbol(sym.WHILE); }
    "function"             { return symbol(sym.FUNCTION); }
    "for"             { return symbol(sym.FOR); }
    "to"             { return symbol(sym.TO); }
    "int"             { return symbol(sym.INTEGER); }
    "char"             { return symbol(sym.CHAR); }
    "float"             { return symbol(sym.FLOAT); }
    "string"             { return symbol(sym.STRING); }
    "bool"             { return symbol(sym.BOOLEAN); }
    "of"            {return symbol(sym.OF);}
    "array"         {return symbol(sym.ARRAY);}
    "return"         {return symbol(sym.RETURN);}
    "["             {return symbol(sym.LBRACK);}
    "]"             {return symbol(sym.RBRACK);}
    ">"             { return symbol(sym.GREATERTHAN); }
    "<"             { return symbol(sym.LESSTHAN); }
    ">="             { return symbol(sym.GREATEROREQUALTHAN); }
    "<="             { return symbol(sym.LESSOREQUALTHAN); }
    "=="             { return symbol(sym.EQUALSEQUALS); }
    "!="             { return symbol(sym.NOTEQUALS); }
    {dec_int_lit}      { 
                         return symbol(sym.NUMBER, new Integer(yytext())); }
    {dec_int_id}       { 
                         return symbol(sym.ID, yytext() );}
    {WhiteSpace}       { /* just skip what was found, do nothing */ }   
}
[^]                    { throw new Error("Illegal character <"+yytext()+">"); }
