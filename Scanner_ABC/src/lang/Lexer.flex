%%
%class search
%standalone
%line
%column
Whitespace = [\t\n]+
%%
(a|b*)aab               { System.printf(
                        "***found match [%s] at line %d, column %d\n",
                        yytext(),yyline,yycolumn);}
{Whitespace}            {/* Do nothing */}
.                       {/* Do nothing */}




