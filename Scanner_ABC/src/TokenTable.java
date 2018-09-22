
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
    
    private static String[][] data;
    private static String[] columnNames = {"Token",
                        "Tipo de Token",
                        "Linea"};
    
    private ArrayList<String> lexemas = new ArrayList<>();
    

    public TokenTable() {}
    
    
    public TokenTable(ArrayList<Token> _tokens) {
        tokens = _tokens;
        
    }
    
    public void addToken(Token _token) {
        tokens.add(_token);
    }
    
    
    private void addAllLineOccurrences() {
        int size = tokens.size();
        Token t1,t2;
        
        lexemas = new ArrayList<>();
      
        // esta parte le cambia la cantidad de veces que aparece un token por linea
        // es decir si aparece while dos veces, cada token va a tener que en esa linea
        // tiene occurrences = 2 
        for (int i = 0; i < size; i++) {
            t1 = tokens.get(i);
            int line = t1.getLine();
            
            // busca las repeticiones de ese mismo token
            for (int j = 0; j < size; j++) {
                t2 = tokens.get(j);
                
                // si se repite en la misma linea
                if ((t2.getLine() == line)&& (t2.getLexema().equals(t1.getLexema()))) {
                    
                    if (!lexemas.contains(t2.getLexema())) {
                        lexemas.add(t2.getLexema());
                    }
                    
                    t1.addOccurrence();
                }               
            }            
        }
    }
    
    private void createTable() {
        for (int row = 0; row < 3; row ++) {
            for (int col = 0; col < lexemas.size(); col++) {
                data[row][col] = " ";
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
