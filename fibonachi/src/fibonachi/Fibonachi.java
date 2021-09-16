package Fibonachi;

import java.util.Scanner;



public class Fibonachi {

     static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       int a = 0, b = 1, c, n;
         System.err.println("por favor ingrese cantidad de elemntos para la serie: ");
         n = teclado.nextInt();
         
         for (int i = 0; i < n; i++) {
             System.out.println(a);
             c = a + b;
             b = a + c;
             a = b + c;
                  
             
         }
       
    }
    
}
