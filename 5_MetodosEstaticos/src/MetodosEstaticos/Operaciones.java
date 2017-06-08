/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosEstaticos;

import java.util.Scanner;

/**
 *
 * @author alex_
 */
public class Operaciones {
    
        
    public static int muestraMenu(){
        
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplica");
        System.out.println("4) Divide");
        System.out.println("5) Potencia");
        System.out.println("10) Salir");
        System.out.println("?");
        
        Scanner sc = new Scanner(System.in);
         
        int op = sc.nextInt(); sc.nextLine();
        return op;
        
    }
    
    public static int capturaNum(){
        
        System.out.print("Ingrese un numero: ");
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt(); sc.nextLine();;
        return num;
        
    }
        
    public static void descifraOp(int op, int num1, int num2){
       
        if(op == Main.SUMA)
            System.out.println(num1+" + "+num2+" = "+suma(num1,num2));
        else if(op == Main.RESTA)
            System.out.println(num1+" - "+num2+" = "+resta(num1,num2));
        else if(op == Main.DIVIDE)
            System.out.println(num1+" / "+num2+" = "+divide(num1,num2));
        else if(op == Main.MULTIPLICA)
            System.out.println(num1+" * "+num2+" = "+multiplica(num1,num2));
        else if(op == Main.POTENCIA)
            System.out.println(num1+" ^ "+num2+" = "+potencia(num1,num2));
        else
            System.out.println("Opcion invalida!!");
        
    }
        
    private static double suma(double a, double b){
        
        return a+b;
        
    }
    
    private static double resta(double a, double b){
        
        return a-b;
        
    }
    
    private static double multiplica(double a, double b){
        
        return a*b;
        
    }
    
    private static double divide(double a, double b){
        
        return a/b;
        
    }
    
    private static double potencia(double a, double b){
        
        return Math.pow(a,b);
        
    }
    
}
