/**
 * Me permite Capturar errores.
 * @author LeonRave
 * @version 1.1
 * @see int
 */
package Errores;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex_
 */
public class Main {

    public static void main(String[] args) {
        
        PrintWriter pw = null;
        
            
            try{
                
                int num = new Integer("Hola");
                System.out.println(num);
                
            }catch(NumberFormatException e){
                
                System.out.println("ERROR: No se puede convertir la cadena");
                
            }
            
            
            try{
                pw = new PrintWriter("Archivo.txt");
                pw.write("Hola mi Archivo");
                pw.close();
            }catch(FileNotFoundException ex){
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                pw.close();
            }
        
    }
    
}
