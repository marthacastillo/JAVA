/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesFraccion;

public class Operaciones {
    
    public static Fraccion suma(Fraccion f1, Fraccion f2){
        
        Fraccion f = new Fraccion(f1.getNumerador()*f2.getDenominador()+f2.getNumerador()*f1.getDenominador() , f1.getDenominador()*f2.getDenominador());
        f.simplificar();
        return f;
        
    }
    
    public static Fraccion resta(Fraccion f1, Fraccion f2){
        
        Fraccion f = new Fraccion(f1.getNumerador()*f2.getDenominador()-f2.getNumerador()*f1.getDenominador() , f1.getDenominador()*f2.getDenominador());
        f.simplificar();
        return f;
        
    }
    
    public static Fraccion multiplica(Fraccion f1, Fraccion f2){
        
        Fraccion f = new Fraccion(f1.getNumerador()*f2.getNumerador() , f1.getDenominador()*f2.getDenominador());
        f.simplificar();
        return f;
        
    }
    
    public static Fraccion divide(Fraccion f1, Fraccion f2){
        
        Fraccion f = new Fraccion(f1.getNumerador()*f2.getDenominador() , f1.getDenominador()*f2.getNumerador());
        f.simplificar();
        return f;
        
    }
    
}
