/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lang;

import java.io.File;

/**
 *
 * @author danielalvarado
 */
public class scanner {
    
    
    
    
    
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        generateLexer(path);
        
        
    }
    
    public static void generateLexer(String _path) {
        File file = new File(_path);
        JFlex.Main.generate(file);
    }
    
    
    
}
