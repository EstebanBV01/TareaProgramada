
package JuegoDeLaVida.Datos;
/**
 *
 * @author EstebanBV, Fernanda, Juan Carlos
 * @version 28/10/2018
 */
public class Cuadricula {
    Celda[][] juego;
    private static final int TAMA = 3;

    public Cuadricula() {
        Celda[][] celda = new Celda[TAMA][TAMA]; 
    }
    
    
    
    public Cuadricula(Celda[][] cant) {   
        if (cant == null) {
            Celda[][] celda = new Celda[TAMA][TAMA]; 
        }else {
            Celda[][] celda = cant;
        }  
    } 
    
    public void random(int cantDeCeldas) {   
        int aleatorio = 0 ,aleatorio2 = 0 ;
        int max = juego.length-1; 
        int min = 0; 
        int range = max - min + 1;
        for (int i = 0; i < cantDeCeldas; i++) {
           aleatorio  = (int)(Math.random() * range) + min;
           aleatorio2 = (int)(Math.random() * range) + min;
                this.juego[aleatorio][aleatorio2].setEstado(true); 
        }
    }
    
    public int getSize() {
        return juego.length;
    }
}