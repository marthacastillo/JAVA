/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author alex_
 */
public class Main {
    public static void main(String[] args) {
        
        char caracter = 'a';
        //System.out.println(caracter);
        int ascii = (int)caracter;
        //System.out.println(ascii);
        //System.out.println('a'+2);
        
        String str = "Hola mundo";
        
        for(int i=0; i<str.length(); i++){
            
            caracter = str.charAt(i);
            ascii = (int)caracter;
            
            System.out.println(""+caracter+" "+ascii);
            
        }
        
        caracter = str.charAt(0);  //Convierte una parte del string en char
        caracter = Character.toUpperCase(caracter);   //Convierte char a mayusculas
        str = caracter + str.substring(1);   //Concatena char con el substring
        System.out.println(str);
        
        //Cadena vacia 
        String s1 = "";
        String s2 = new String();
        //Cadena no iniciada
        String s;
        
        //apuntan al mismo valor
        String s3 = "Hola";
        String s4 = s3;
        System.out.println("s3 "+(s3==s4)+" s4");
        System.out.println("s3 "+(s3.equals(s4))+" s4");
        
        //Crea una copia 
        String s5 = new String("hola");
        String s6 = new String(s5);
        System.out.println("s5 "+(s5==s6)+" s6");
        System.out.println("s5 "+(s5.equals(s6))+" s6");
        
        //pasa de uno a otro
        char []letras = {'j','a','v','a'};
        String palabra = new String(letras);
        letras = palabra.toCharArray();
        
        //Busca la palabra y en que posicion
        System.out.println( palabra.indexOf("chucha") );
    }
    
}
