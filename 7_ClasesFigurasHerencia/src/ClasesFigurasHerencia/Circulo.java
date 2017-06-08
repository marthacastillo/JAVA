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
public class Circulo extends Poligono implements IFigura{
    
    double radio;
    
    public Circulo(double radio, String nombre){
        super(nombre, 0);
        this.radio = radio;
    }
    
    @Override
    public double area(){
        return radio*radio*Math.PI;
    }
    
    @Override
    public double perimetro(){
        return Math.PI*radio*2;
    }
    
    @Override
    public double semiPerimetro(){
        return perimetro()/2;
    }
    
    @Override
    public boolean esEquilatero(){
        return true;
    }
    
}
