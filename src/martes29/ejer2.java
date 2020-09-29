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
public class ejer2 {
    
      static Scanner entrada=new Scanner(System.in);
      
        public static void main(String[] args) {
            
       
            int i;
            int count =0;
            int producto=1;
            
            
             System.out.println("Inserte números enteros positivos para encontrar "
                    + "su producto.Para terminar inserte un número negativo");
           
             i=entrada.nextInt();
             
            while(i>=0){
            
            producto*=i;
             count++;
              System.out.println("Inserte números enteros positivos para encontrar "
                    + "su producto.Para terminar inserte un número negativo");
              
                  i=entrada.nextInt();
                
            }
            
            System.out.println(producto);
            System.out.println(count);
            //--------------------------------------------
       
          
        }
        
        
}
