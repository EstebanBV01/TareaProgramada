
package JuegoDeLaVida.Datos;

/**
 *
 * @author EstebanBV, Fernanda, Juan Carlos
 * @version 28/10/2018
 */
public class Cuadricula{
    private Celda[][] celda;
    private static final int TAMA = 5;
    public Cuadricula(Celda[][] cells) {   
            Celda[][] celda = new Celda[TAMA][TAMA];
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
}