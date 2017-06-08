/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosEstaticos;


public class Main {

    public static final int SALIR = 10;
    public static final int SUMA = 1;
    public static final int RESTA = 2;
    public static final int MULTIPLICA = 3;
    public static final int DIVIDE = 4;
    public static final int POTENCIA = 5;
    
    public static void main(String[] args) {

        //System.out.println("Suma "+Operaciones.suma(5,2));
        //System.out.println("Resta "+Operaciones.resta(5,2));
        //System.out.println("Divide "+Operaciones.divide(5,2));
        //System.out.println("Multiplica "+Operaciones.multiplica(5,2));

        while(true){
            
           int op = Operaciones.muestraMenu();

           if(op != SALIR){
                int num1 = Operaciones.capturaNum();
                int num2 = Operaciones.capturaNum(); 
                Operaciones.descifraOp(op, num1, num2);
           }
           else
               break;
            
        }
        
        
    }
    
}
