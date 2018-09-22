
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielalvarado
 */
public class TokenTable {
    private static ArrayList<Token> tokens = new ArrayList<>();
    private static ArrayList<Token> newTokens = new ArrayList<>();
    
    //private ArrayList<String> ocurrences;
    
    
    public TokenTable() {}
    
    
    public TokenTable(ArrayList<Token> _tokens) {
        tokens = _tokens;
        
    }
    
    public void addToken(Token _token) {
        tokens.add(_token);
    }
    
    
    
    
    private void createTable() {
        int size = tokens.size();
        Token t1,t2;
        
        for (int i = 0; i < size; i++) {
            t1 = tokens.get(i);
            int line = t1.getLine();
            
            // busca las repeticiones de ese mismo token
            for (int j = 0; j < size; j++) {
                t2 = tokens.get(j);
                
                // si se repite en la misma linea
                if ((t2.getLine() == line)&& (t2.getLexema().equals(t1.getLexema()))) {
                    t1.addOccurrence();
                }               
            }            
        }
        
        for (int i = 0; i < size; i++) {
            t1 = tokens.get(i);
            int line = t1.getLine();
            
            // busca las repeticiones de ese mismo token
            for (int j = 0; j < size; j++) {
                t2 = tokens.get(j);
                
                // si se repite en la misma linea
                if (t2.getLexema().equals(t1.getLexema())) {
                    
                }               
            }            
        }
        
        
        
    }
    
    /*
    
    String[] columnNames = {"Token",
                        "Tipo de Token",
                        "Linea"};
Its data is initialized and stored in a two-dimensional Object array:

Object[][] data = {
    {"Kathy", "Smith",
     "Snowboarding", new Integer(5), new Boolean(false)},
    {"John", "Doe",
     "Rowing", new Integer(3), new Boolean(true)},
    {"Sue", "Black",
     "Knitting", new Integer(2), new Boolean(false)},
    {"Jane", "White",
     "Speed reading", new Integer(20), new Boolean(true)},
    {"Joe", "Brown",
     "Pool", new Integer(10), new Boolean(false)}
};
    
    */
    
    
    public void printTable() {
        createTable();
    }
    
}
