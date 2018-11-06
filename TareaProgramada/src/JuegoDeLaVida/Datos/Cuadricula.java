
package JuegoDeLaVida.Datos;

import javax.swing.JOptionPane;

/**
 *
 * @author EstebanBV, Fernanda, Juan Carlos
 * @version 28/10/2018
 */
public class Cuadricula{
    private Celda[][] celda;
  //  private Cuadricula[][] cells;
    private Celda viva;
    private final static int SIZE = 2;  
    private static final int TAMA = 5;
    
    public Cuadricula() {   
        Celda[][] celda = new Celda[TAMA][TAMA]; 
    } 
    
    public Cuadricula(int cant) {   
        if (cant != 0) {
            Celda[][] celda = new Celda[cant][cant];
        }else if (cant == 0) {
            Celda[][] celda = new Celda[TAMA][TAMA];
        }
    } 
    
    public void setCelda(Celda[][] celda){
        this.celda = celda;
    }

    public Celda[][] getCelda() {
        return celda;
    }

    @Override
    public String toString() {
        return "[Cuadricula]" + "celda: " + celda;
    }
    
    // Algunos metodos logicos, lineas, sustitucion de posiciones van aqui 

    public void setElement (int element) {
        for (int f = 0; f < celda.length; f++) {
            for (int c = 0; c < celda.length; c++) {
                //Aqui falta la parte para sustuir, 
            }
        }
    }      

    public void stringMatrix(){
        String cadena = "";
        for (int f = 0; f < celda.length; f++) {
            for (int c = 0; c <celda.length; c++) {
                cadena += celda[f][c]+" | ";
            }
            cadena += "\n";
        }
        System.out.println(cadena+"\n");
    }
    public int matrixSize(){
    return celda.length;
    }
    //metodos comunes
    
    public Celda[][] posiAleatorias(int cantDeCeldas){
        int aleatorio = 0 ,aleatorio2 = 0 ;
        int max = celda.length-1; 
        int min = 0; 
        int range = max - min + 1;
        for (int i = 0; i < cantDeCeldas; i++) {
           aleatorio  = (int)(Math.random() * range) + min;
           aleatorio2 = (int)(Math.random() * range) + min;
                this.celda[aleatorio][aleatorio2] = viva; 
        }
        return this.celda;
    }
    public void setSize(int size){
           Cuadricula[][] vector2 = new Cuadricula[size][size];
            for (int i = 0; i < celda.length; i++) {
                vector2[i]= this.celda[i][i];
                
        }
            vector2 = celda;
    }
    public void rule1(){
        boolean desicion;
        do {            
            
            desicion=Boolean.parseBoolean(JOptionPane.showInputDialog("desea continuar true/false"));
            
        }while (desicion==true);
    }
}