/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArregloOrdenamiento;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alex_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int array[]; 
        int tam;  
        Random rand = new Random();  //Se crea objeto que permite generar aleatorios
        Scanner sc = new Scanner(System.in);  //Se crea el objeto asociado al dispositivo de entrada

        System.out.println("¿Cual sera el tamaño del array?");
        tam = sc.nextInt(); sc.nextLine(); //Lee el buffer de teclado y asigna a int
        array = new int[tam];

        for(int i = 0; i < tam; i++){

            array[i] = rand.nextInt(10);
            System.out.print(array[i]+ " ");

        }
        System.out.println();
        
        //Ordenamiento de la burbuja :3
        int aux;
        for(int i = 0; i < tam - 1; i++){
            for(int j = 0; j < tam-i-1; j++){
                
                if(array[j]>array[j+1]){
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
                        
            }
        }
        
        for(int i = 0; i < tam; i++){

            System.out.print(array[i]+ " ");

        }
        
    }
    
}
