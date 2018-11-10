
package JuegoDeLaVida.Datos;

/**
 *
 * @author Esteban BV, Fernanda AA, Juan Carlos VA
 */


public class Celda {
    private boolean estado;

    /**
     * Metodo para asignar el estado de la celda
     * @param estado que asigna la vida o muerte de la celda
     */
    public Celda(boolean estado) {
        this.estado = estado;
    }

    /**
     * Metodo para obtener el estado actual de la celda
     * @return el estado de la celda
     */
    public boolean getEstado() {
        return estado;
    }

    /**
     * Metodo para asignar el estado de la celda
     * @param estado que asigna la vida o muerte de la celda
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * Metodo de impresion
     * @return Un String con la Celda
     */
    @Override
    public String toString() {
        return "Celda{" + "estado=" + estado + '}';
    }  
}

