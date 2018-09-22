/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author CASA
 */

public class Token {
    Types _token;
    String _lexema;
    int _line = 0;

    public String getLexema(){
        return this._lexema;
    }

    public Types getToken(){
        return this._token;
    }
   
    public void setLine(int l){
        this._line = l;        
    }

    public Token (String lexema, Types token){
        this._lexema = lexema;
        this._token = token;
    }
    
    public Token (String lexema, Types token, int line){
        this._lexema = lexema;
        this._token = token;
        this._line = line+1;
    }

    public String toString(){
        return "Lexema: " + this._lexema + " Token: " + this._token.toString() +
                " Line: " + this._line +";";
    }
}
