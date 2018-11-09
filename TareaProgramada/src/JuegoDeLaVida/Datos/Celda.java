
package JuegoDeLaVida.Datos;

/**
 *
 * @author Esteban, Fernanda, Juan Carlos
 */
public class Celda {
    private boolean estado;

    public Celda(boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Celda{" + "estado=" + estado + '}';
    }  
}

