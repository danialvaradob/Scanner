
import java.util.ArrayList;
import javax.swing.JTable;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

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
    
    private JTable tokensTable;
    

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
                if ((t2.getLine() == line)&& (toUpperCase(t1.getLexema()).equals(toUpperCase(t2.getLexema()))) && !(t1.equals(t2)) ) {
                    
                    
                    
                    t1.addOccurrence();
                }
                if (!lexemas.contains(t2.getLexema())) {
                        lexemas.add(t2.getLexema());
                    }
            }            
        }
    }
    
    //CAMBIAR A PRIVADO
    public void createTable() {
        
        this.addAllLineOccurrences();
        
        String lexema,type,occrr;
        occrr = " ";
        type = " ";
        lexema = " ";
        Token t1,t2;
        
        for (int token = 0; token < lexemas.size(); token ++) {
            
            for (int i = 0; i < this.tokens.size(); i++) {
            
                //token el cual se esta analizando
                t1 = tokens.get(i);
                
                // se obtiene el lexema
                lexema = t1.getLexema();
                
                //se obtienen la linea
                occrr = Integer.toString(t1.getLine());
                
                //si tiene mas de una ocurrencia encontrado en la funcion previa
                // se agrega a occrr
                if (t1.occurrences > 0) {
                    occrr += "(" + t1.occurrences + ")";
                }
                
                // busca las repeticiones de ese mismo token
                for (int j = 0; j < this.tokens.size(); j++) {

                    t2 = tokens.get(j);

                    // si el lexema es igual y estan en la misma linea, remueve la repeticion
                    
                    if ((t2.getLine() == t1.getLine())&& (toUpperCase(t1.getLexema()).equals(toUpperCase(t2.getLexema())))) {
                        this.tokens.remove(t2);
                    } 
                    // si es el mismo lexema pero no en la misma linea, lo agrega al string de repeticiones
                    else if (!(t2.getLine() == t1.getLine()) && (toUpperCase(t1.getLexema()).equals(toUpperCase(t2.getLexema())))){
                        occrr += "," + t2.getLine();
                    }              
                } 
            
            }
            // recorre la lista de toknes
            
            
            // lexema
            data[token][1] = lexema;
            // tipo de token (type)
            data[token][2] = "";
            // apareiciones en las lineas
            data[token][3] = occrr;
            
        }
        
        tokensTable = new JTable(data, columnNames);
        
        
        
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
