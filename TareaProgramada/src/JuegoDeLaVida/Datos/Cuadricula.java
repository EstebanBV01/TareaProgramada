
package JuegoDeLaVida.Datos;

/**
 *
 * @author Juan Carlos,EstebanBV, Fernanda
 * @version 28/10/2018
 */
public class Cuadricula{
    private Celda celda;
    public Cuadricula(Celda cells) {   
            this.celda = cells;
      
    } 
    public void setCelda(Celda celda){
        this.celda = celda;
    }

    public Celda getCelda() {
        return celda;
    }

    @Override
    public String toString() {
        return "Cuadricula{" + "celda=" + celda + '}';
    }

}