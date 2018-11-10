package JuegoDeLaVida.Datos;

/**
 *
 * @author Esteban BV, Fernanda AA, Juan Carlos VA
 * @version 28/10/2018
 */
public class Cuadricula {

    
    Celda[][] juego;
    public int SIZE=3;
    Celda c = new Celda(true);
    Celda CeldaMuerta = new Celda(false);
   
     /**
      * Contructor para iniciar el tamaño de la matriz de forma predeterminada
      */
    public Cuadricula(){
         this.juego = new Celda[SIZE][SIZE];
    }
    
    /**
     * Contructor para iniciar el tamaño de la matriz
     * @param cant Determina el tamaño de la matriz
     */
    public Cuadricula(int cant) {
        this.juego = new Celda[cant][cant];
        
          for (int f = 0; f < juego.length; f++) {
            for (int c = 0; c < juego.length; c++) {
                this.juego[f][c]=CeldaMuerta;
            }
        }
    }
    
    /**
     * Genera posiciones aleatorias en la matriz
     * @param cantDeCeldas Cantidad de celdas aleatorias
     */
    public void random(int cantDeCeldas) {
       for(int i=0;i<=cantDeCeldas;i++){
        int numero = (int) (Math.random() * (juego.length -1));
        int numero2 = (int) (Math.random() * (juego.length -1));
            this.juego[numero][numero2] = c;
        }
    }
   
    /**
     * Metodo para asignar las posiciones en la matriz
     * @param X Posicion X
     * @param Y Posicion Y
     */
    public void setPositions(int X, int Y) {
        boolean decision=true;
            juego[X][Y]= c;
    }

    /**
     * Metodo para retornar e tamaño de la matriz
     * @return El tamaño de la matriz
     */
    public int getSize() {
        return juego.length;
    }

    /**
     * Metodo para retornar la matriz
     * @return 
     */
    public Celda[][] getMatriz() {
        return juego;
    }

    /**
     * Metodo para asignar una matriz
     * @param newCelda Matriz ya creada
     */
    public void setMatriz(Celda[][] newCelda) {
        this.juego = newCelda;
    }
}
