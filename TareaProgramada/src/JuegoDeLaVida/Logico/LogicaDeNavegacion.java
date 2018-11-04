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
    private int size=2;
    Celda viva=new Celda("X","");
    Cuadricula viva2=new Cuadricula(viva);
     public void setSize(int size) {
        this.size = size;
    }
    public LogicaDeNavegacion(Cuadricula[][] cells) {
        this.cells = cells;
    }
    public LogicaDeNavegacion(){
        cells=new Cuadricula[size][size];
    }
    public void stringMatrix(){
        String cadena="";
        for (int f = 0; f < cells.length; f++) {
            for (int c = 0; c <cells.length; c++) {
                cadena+=cells[f][c]+" | ";
            }
            cadena+="\n";
            
        }
        System.out.println(cadena+"\n");
    }
    
    //metodos comunes
    
    public Cuadricula[][] posiAleatorias(int cantDeCeldas){
        int aleatorio=0,aleatorio2=0;
         int max = 2; 
        int min = 0; 
        int range = max - min + 1;
        for (int i = 0; i < cantDeCeldas; i++) {
           aleatorio  = (int)(Math.random() * range) + min;
           aleatorio2 = (int)(Math.random() * range) + min;
               // this.cells[aleatorio][aleatorio2]=viva2.getCelda().getViva(); 
        }
        return this.cells;
    }
    private void matrixSize(){
           Cuadricula[][] vector2=new Cuadricula[cells.length*2][cells.length*2];
            for (int i = 0; i < cells.length; i++) {
                vector2[i]=this.cells[i];
        }
            this.cells=vector2;
    }
    public void rule1(){
        boolean desicion;
        do {            
            
            desicion=Boolean.parseBoolean(JOptionPane.showInputDialog("desea continuar true/false"));
            
        }while (desicion==true);
    }
}
