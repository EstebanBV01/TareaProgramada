
package JuegoDeLaVida.Datos;

/**
 *
 * @author Juan Carlos,EstebanBV, Fernanda
 * @version 28/10/2018
 */
public class Cuadricula{
    private Celda[][] celda;
    private static final int CELLS = 3;
   
    public Cuadricula(Celda[][] cells) {   
        if (cells != null) {
            this.celda = cells;
        }else {
            this.celda = new Celda[CELLS][CELLS];
        }
    } 
    
    public Celda[][] getCelda() {
        return celda;
    }

    public void setCelda(Celda[][] celda) {
        this.celda = celda;
    }

    @Override
    public String toString() {
        return "Cuadricula{" + "celda=" + celda + '}';
    }
    
    
    
    
}
