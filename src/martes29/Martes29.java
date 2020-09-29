/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martes29;

import java.util.Scanner;

/**
 *
 * @author Semipresencial 1º
 */
public class Martes29 {

    
    static Scanner entrada=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float result=(float) 1/3;
        float result2= 1/3;
        System.out.println(result+" y el float 2 es "+ result2);
        int opcion=1;
        
        switch (opcion){
            
            case 0: 
                System.out.println("el valor es 0");
                break;
            case 1: 
                System.out.println("el valor es 1");
                break;
            case 2: 
                System.out.println("el valor es 2");
                break;
        }
        
        int j=0;
        System.out.println("Inserte el valor de j");
        
        j=entrada.nextInt();
        
        while(j<5){
            
            System.out.println(j);
            j++;
        }
    }
    
}
