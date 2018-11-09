/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeLaVida.Logico;

import JuegoDeLaVida.Datos.Celda;
import JuegoDeLaVida.Datos.Cuadricula;
import javax.swing.JOptionPane;

/**
 *
 * @author estebanbv
 */
public class LogicaDeNavegacion {
    
    Celda celda;
    int[][] logica = new int[5][5];
    
    public LogicaDeNavegacion (int cantDeCeldas){
        int aleatorio = 0 ,aleatorio2 = 0 ;
        int max = logica.length-1; 
        int min = 0; 
        int range = max - min + 1;
        for (int i = 0; i <= cantDeCeldas; i++) {
           aleatorio  = (int)(Math.random() * range) + min;
           aleatorio2 = (int)(Math.random() * range) + min;
                this.logica[aleatorio][aleatorio2] = 1; 
        }
    }
    
    
    public int[][] regla () {
        int cont = 0;
        //while (cont < logica.length) {       
            for (int f = 0; f<logica.length; f++) {
                for (int c = 0; c<logica.length; c++) {
                    if (logica[f][c] == 1);
                    for (int i = f; i <f+1; i++) {
                        for (int j = c; j < c+1; j++) {
                            if (logica[i][j]==1) {
                                System.out.println("encontro" + j +","+ i);
                            }
                        }
                    }            
                }
               
            }
            
            cont++;
        //}
        return logica;
    }

     public void estado () {
        for (int f = 0; f < logica.length; f++) {
            for (int c = 0; c < logica.length; c++) {
                if (logica[f][c] == 1) {
                    
                }
            }
        }
    }

    public int[][] posiAleatorias(int cantDeCeldas){
        int aleatorio = 0 ,aleatorio2 = 0 ;
        int max = logica.length-1; 
        int min = 0; 
        int range = max - min + 1;
        for (int i = 0; i < cantDeCeldas; i++) {
           aleatorio  = (int)(Math.random() * range) + min;
           aleatorio2 = (int)(Math.random() * range) + min;
                this.logica[aleatorio][aleatorio2] = 1; 
        }
        return this.logica;
    }
}
