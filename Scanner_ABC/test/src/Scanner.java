/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author CASA
 */
public class Scanner {
    public static void main(String [ ] args){

        try{
            File file = new File("test/src/prueba.txt");
            String path = file.getAbsolutePath();
           // Path p = Paths.get("prueba.txt");
            //Path folder = p.getParent();
            String archivo = path;
            
            /*String archivo = "D:/SegundoSemestre2018/Compiladores e Intérpretes/Proyectos/Proyecto1/"
                    + "Scanner/Scanner_ABC/test/src/prueba.txt";*/

            // Se trata de leer el archivo y analizarlo en la clase que se ha creado con JFlex
            BufferedReader buffer = new BufferedReader(new FileReader(archivo));
            ScannerABC analizadorJFlex = new ScannerABC(buffer);

            while(true){

                // Obtener el token analizado y mostrar su información
                Token token = analizadorJFlex.yylex();

                if (!analizadorJFlex.existenTokens())
                break;

                System.out.println(token.toString());
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
