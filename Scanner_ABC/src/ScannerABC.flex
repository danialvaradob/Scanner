/* Secci�n de declaraciones de JFlex */
%%
%public
%class ScannerABC
%{
 
 /* C�digo personalizado */
 
 // Se agreg� una propiedad para verificar si existen tokens pendientes
 private boolean _existenTokens = false;
 
 public boolean existenTokens(){
 return this._existenTokens;
 }
 
%}
 
 /* Al utilizar esta instrucci�n, se le indica a JFlex que devuelva objetos del tipo TokenPersonalizado */
%type Token
 
%init{
 /* C�digo que se ejecutar� en el constructor de la clase */
%init}
 
%eof{
 
 /* C�digo a ejecutar al finalizar el an�lisis, en este caso cambiaremos el valor de una variable bandera */
 this._existenTokens = false;
 
%eof}
 
/* Inicio de Expresiones regulares */
 
 Digito = [0-9]
 Numero = {Digito} {Digito}*
 Letra = [A-Za-z]
 
 Palabra = {Letra} {Letra}*
 Simbolo = "*"|"+"|"-"|"/"|"#"
 Espacio = " "
 SaltoDeLinea = \n|\r|\r\n
 
InputChar       =       [^\n\r]
SpaceChar       =       [\ \t]
LineChar        =       \n | \r | \r | \n     
Alpha           =       [A-Za-z_] 
Digit           =       [0-9]
AlphaNumeric    =       {Alpha}|{Digit}
Identifier      =       {Alpha}({AlphaNumeric})*
Number          =       ({Digit})+
WhiteSpace      =       ([\ \n\r\t\f])+ 
Zero            =       0
Integer         =       [1-9][0-9]*(\.){Zero} | {Zero} \. {Zero}
Exponent        =       [eE] [\+ \-]? [0-9]+
Float1          =       [0.9]+ \.




/* Finaliza expresiones regulares */
 
%%
/* Finaliza la secci�n de declaraciones de JFlex */
 
/* Inicia secci�n de reglas */
 
// Cada regla est� formada por una {expresi�n} espacio {c�digo}
 
{Numero} {
 Token t = new Token(yytext(), "NUMERO");
 this._existenTokens = true;
 return t;
}
 
{Palabra} {
 Token t = new Token(yytext(), "PALABRA");
 this._existenTokens = true;
 return t;
}
 
{Simbolo} {
 Token t = new Token(yytext(), "SIMBOLO");
 this._existenTokens = true;
 return t;
}
 
{Espacio} {
 // Ignorar cuando se ingrese un espacio
}
 
{SaltoDeLinea} {
 Token t = new Token("Enter", "NUEVA_LINEA");
 this._existenTokens = true;
 return t;
}