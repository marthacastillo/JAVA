/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesFraccion;

public class Fraccion {

    private int numerador;
    private int denominador;
    
    public Fraccion(){
    
        numerador = 0;
        denominador = 1;
    
    }
    
    public Fraccion(int numerador, int denominador){
    
        this.numerador = numerador;
        if(denominador!=0){
            this.denominador = denominador;   
        }
        else{
            throw new RuntimeException("El denominador no puede ser 0");
        }
    
    }
    
    public Fraccion(String numerador, String denominador){
    
        this.numerador = Integer.parseInt(numerador);
        if(Integer.parseInt(denominador)!=0){
            this.denominador = Integer.parseInt(denominador);   
        }
        else{
            throw new RuntimeException("El denominador no puede ser 0");
        }
    
    }
    
    @Override
    public String toString(){
        
        return numerador + " / " + denominador;
        
    }
    
    public void fraccionEquivalente(int n){
        
        numerador = numerador * n;
        denominador = denominador * n;
        
    }
    
    public void simplificar(){
        
        int divisor = 2;
        while(divisor < numerador || divisor < denominador){
            
            if(numerador % divisor == 0 && denominador % divisor == 0){
                numerador = numerador / divisor;
                denominador = denominador / divisor;
            }
            else
                divisor++;
            
        }
        
    }
    
    public void invertir(){
        
        int aux = denominador;
        denominador = numerador;
        numerador = aux;
        
    }
    
    public double enDecimal(){
        
        return (double)numerador/(double)denominador;
        
    }
    
    public int obtenerParteEntera(){
        
        return numerador/denominador;
        
    }
    
    public int getNumerador() {
        
        return numerador;
        
    }

    public int getDenominador() {
        
        return denominador;
        
    }
    
    public void setNumerador(int numerador) {
        
        this.numerador = numerador;
        
    }

    public void setDenominador(int denominador) {
        
        if(denominador!=0){
            this.denominador = denominador;   
        }
        else{
            throw new RuntimeException("El denominador no puede ser 0");
        }
        
    }
    

    
}
