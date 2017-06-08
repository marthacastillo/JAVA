/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesFigurasHerencia;

/**
 *
 * @author alex_
 */
public class Main {


    public static void main(String[] args) {
        
        /*
        Rectangulo r1 = new Rectangulo(4,5, "Rectangulo");
        System.out.println(r1);
        System.out.println(r1.area());
        System.out.println(r1.perimetro());
        
        Cuadrado c1 = new Cuadrado(4, "Cuadrado");
        System.out.println(c1);
        System.out.println(c1.area());
        System.out.println(c1.perimetro());
        
        Circulo cc1 = new Circulo(4, "Circulo");
        System.out.println(cc1);
        System.out.println(cc1.area());
        System.out.println(cc1.perimetro());   */
        
        Rectangulo rectangulo = new Rectangulo(4,5, "Rectangulo");
        Cuadrado cuadrado = new Cuadrado(4, "Cuadrado");
        Circulo circulo = new Circulo(4, "Circulo");
        
        IFigura [] figuras = new IFigura[3];
        figuras[0] = cuadrado;
        figuras[1] = rectangulo;
        figuras[2] = circulo;
        
        for(int i=0; i<figuras.length; i++){
            System.out.println(figuras[i]);
            System.out.println("Area "+figuras[i].area());
            System.out.println("Perimetro "+figuras[i].perimetro());
        }
        
    }
    
}
