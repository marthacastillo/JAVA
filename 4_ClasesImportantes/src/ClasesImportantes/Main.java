/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesImportantes;

public class Main {
    public enum Sabor
{
    CHOCOLATE, VAINILLA, FRESA, NAPOLITANO   //Los objetos solo pueden ser los definidos en esta clase
}
    public static void main(String[] args) {
        
        // Clase enumeraciones
        // limitan la creación de objetos a los especificados en la clase
        // Los valores solo pueden ser identiifcadores escogidos por el programador
        
        Sabor cono1 = Sabor.VAINILLA;
        Sabor cono2 = Sabor.NAPOLITANO;
        
        System.out.println(Sabor.values()[0]); //Devuelve un array con los enum
        
        System.out.println(cono1);
        System.out.println(cono1.ordinal());
        System.out.println(cono1.name());
        System.out.println(cono1.compareTo(cono2));
        
        Sabor cono3 = cono1;
        
        System.out.println(cono3);
        System.out.println(cono3.ordinal());
        System.out.println(cono3.name());
        System.out.println(cono3.compareTo(cono2));
        
        // Clases envolventes
        // Permiten usar tipos primitivos como objetos
        
        Integer num1 = new Integer(40);        //Por ejemplo esta clase contiene constantes utiles como sus limites
        int num2 = Integer.parseInt("40");     //Estso objetos se puedne convertir en int y viceversa solo asignandolo
        num1 = num2;
        num2 = num1;
        
        System.out.println(Math.sqrt(10));   //Clase math para utilidades matematicas
    }
    
}
