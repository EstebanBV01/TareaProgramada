/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo2;

/**
 *
 * @author usuario
 */
public class Main {
    
        public static void main(String[] args) {
            System.out.println(divicion(4, 2));
            
        }
        //a-b es el caso base.
        //Condicion de salida es si a <= b aplicar el else.
        //Condicion para terminar a < b.
        public static int divicion(int a, int b) {
           int cont = 0; 
           if (a < b) {
               return cont;
               
            }else {
                return (cont +1) + divicion(a - b, b);
            }
        }
}
