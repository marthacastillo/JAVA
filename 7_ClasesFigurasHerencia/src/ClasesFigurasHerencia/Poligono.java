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
public abstract class Poligono {
    
    String nombre;
    int numLados;
    
    public Poligono(String nombre, int numLados){
        this.nombre = nombre;
        this.numLados = numLados;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
    public abstract double semiPerimetro();
    public abstract boolean esEquilatero();
    
}
