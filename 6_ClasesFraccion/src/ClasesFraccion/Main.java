/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesFraccion;

/**
 *
 * @author alex_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fraccion f1 = new Fraccion();
        
        System.out.println(f1.toString());
        f1.setNumerador(9);
        f1.setDenominador(6);
        System.out.println(f1.toString());
        
        f1.simplificar();
        
        System.out.println(f1.toString());
        System.out.println(f1.enDecimal());
        System.out.println(f1.obtenerParteEntera());
        
        f1.fraccionEquivalente(4);
        System.out.println(f1.toString());
        
        f1.invertir();
        System.out.println(f1.toString());
        
        Fraccion f2 = new Fraccion(0,10);
        System.out.println(f2);
        //Fraccion f3 = new Fraccion(10,0);
        //System.out.println(f3);
        
        f1 = new Fraccion(3,4);
        System.out.println(f1);
        f2 = new Fraccion(4,5);
        System.out.println(f2);
        
        System.out.println(Operaciones.divide(f1, f2));
        
        
        
    }
    
}
