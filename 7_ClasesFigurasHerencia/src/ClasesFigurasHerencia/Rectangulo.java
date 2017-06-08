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
public class Rectangulo extends Poligono implements IFigura {
    
    private double ladoA;
    private double ladoB;   
    
    public Rectangulo(double ladoA, double ladoB, String nombre){
    
        super(nombre, 4);
        if(ladoA >= 0 && ladoB >= 0){
            
            this.ladoA = ladoA;  
            this.ladoB = ladoB;  
        }
        else{
            throw new RuntimeException("El ancho y largo no pueden ser negativos");
        }
    
    }
    
    @Override
    public double area(){
        
        return ladoA*ladoB;
        
    }
    
    @Override
    public double perimetro(){
        
        return 2 * ladoA + 2 * ladoB;
        
    }
    
    @Override
    public double semiPerimetro(){
        
        return perimetro()/2;
        
    }
    
    public boolean esEquilatero(){
        if(ladoA == ladoB)
            return true;
        else
            return false;
    }

    private double getLongitud() {
        return ladoA;
    }

    private double getAnchura() {
        return ladoB;
    }
    
    private void setLongitud(double ladoA) {
        if(ladoA>=0){
            this.ladoA = ladoA;   
        }
        else{
            throw new RuntimeException("La longitud no debe ser negativa");
        }
    }

    private void setAnchura(double ladoB) {
        if(ladoB>=0){
            this.ladoB = ladoB;   
        }
        else{
            throw new RuntimeException("La anchura no debe ser negativa");
        }
    }
    
}
