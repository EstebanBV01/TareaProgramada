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
    private Cuadricula[][] cells;
    private Cuadricula viva;
    private final static int SIZE= 2;   
    public LogicaDeNavegacion(Cuadricula[][] cells) {
        this.cells = cells;
    }
    public LogicaDeNavegacion(){
        cells = new Cuadricula[SIZE][SIZE];
    }
    public void stringMatrix(){
        String cadena = "";
        for (int f = 0; f < cells.length; f++) {
            for (int c = 0; c <cells.length; c++) {
                cadena += cells[f][c]+" | ";
            }
            cadena += "\n";
            
        }
        System.out.println(cadena+"\n");
    }
    public int matrixSize(){
    return cells.length;
    }
    //metodos comunes
    
    public Cuadricula[][] posiAleatorias(int cantDeCeldas){
        int aleatorio =0 ,aleatorio2 =0 ;
         int max = cells.length-1; 
        int min = 0; 
        int range = max - min + 1;
        for (int i = 0; i < cantDeCeldas; i++) {
           aleatorio  = (int)(Math.random() * range) + min;
           aleatorio2 = (int)(Math.random() * range) + min;
                this.cells[aleatorio][aleatorio2]=viva; 
        }
        return this.cells;
    }
    public void setSize(int size){
           Cuadricula[][] vector2=new Cuadricula[size][size];
            for (int i = 0; i < cells.length; i++) {
                vector2[i]=this.cells[i];
        }
            vector2=cells;
    }
    public void rule1(){
        boolean desicion;
        do {            
            
            desicion=Boolean.parseBoolean(JOptionPane.showInputDialog("desea continuar true/false"));
            
        }while (desicion==true);
    }
}
