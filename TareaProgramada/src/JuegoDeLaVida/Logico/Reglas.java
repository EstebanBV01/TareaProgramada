
package JuegoDeLaVida.Logico;

import JuegoDeLaVida.Datos.Celda;

/**
 *
 * @author Esteban BV, Fernanda AA, Juan Carlos VA
 * @version 7/11/2017
 */
public class Reglas {

    /**
     * 
     * @param nueva de tipo Matriz
     * Metodo para la validacion de celdas vecinas
     * 
     */
    public Celda[][] Rules (Celda[][] nueva) {
        int Cont;
        Celda[][] temp = new Celda[nueva.length][nueva.length];
        Celda CeldaVida = new Celda(true);
        Celda CeldaMuerta = new Celda(false);
        
        for (int X = 0; X < nueva.length; X++) {
            for (int Y = 0; Y < nueva[X].length; Y++) { 
                Cont = 0;
                
                if(X == 0) {

                    if(Y == 0) {
                        if (nueva[X + 1][Y].getEstado() == true) Cont ++;
                        if (nueva[X + 1][Y + 1].getEstado() == true) Cont ++;
                        if (nueva[X][Y + 1].getEstado() == true) Cont++;
                    }else if (Y == nueva[X].length  -1) {
                        if (nueva[X][Y - 1].getEstado() == true) Cont ++;
                        if (nueva[X + 1][Y - 1].getEstado() == true) Cont ++;
                        if (nueva[X + 1][Y].getEstado() == true) Cont++;
                    }else {
                        if (nueva[X][Y - 1].getEstado() == true) Cont ++;
                        if (nueva[X + 1][Y - 1].getEstado() == true) Cont ++;
                        if (nueva[X + 1][Y].getEstado() == true) Cont ++;
                        if (nueva[X + 1][Y + 1].getEstado() == true) Cont++;
                        if (nueva[X][Y + 1].getEstado() == true) Cont++;
                    } 
                    
                }else if(X == nueva.length -1) {
                    
                    if(Y == 0){
                        if (nueva[X - 1][Y].getEstado() == true) Cont ++;
                        if (nueva[X - 1][Y + 1].getEstado() == true) Cont ++;
                        if (nueva[X][Y + 1].getEstado() == true) Cont ++;
                    }else if (Y == nueva[X].length  -1) {
                        if (nueva[X][Y - 1].getEstado() == true) Cont ++;
                        if (nueva[X - 1][Y - 1].getEstado() == true) Cont ++;
                        if (nueva[X - 1][Y].getEstado() == true) Cont ++;
                    }else {
                        if (nueva[X][Y + 1].getEstado() == true) Cont ++;
                        if (nueva[X - 1][Y + 1].getEstado() == true) Cont ++;
                        if (nueva[X - 1][Y].getEstado() == true) Cont ++;
                        if (nueva[X - 1][Y - 1].getEstado() == true) Cont++;
                        if (nueva[X][Y - 1].getEstado() == true) Cont++;
                    }
                    
                }else {
                    
                    if (Y == 0) {
                        if (nueva[X - 1][Y].getEstado() == true) Cont ++;
                        if (nueva[X - 1][Y + 1].getEstado() == true) Cont ++;
                        if (nueva[X][Y + 1].getEstado() == true) Cont ++;
                        if (nueva[X + 1][Y + 1].getEstado() == true) Cont++;
                        if (nueva[X + 1][Y].getEstado() == true) Cont++;
                    }else if (Y == nueva[X].length - 1) {
                        if (nueva[X - 1][Y].getEstado() == true) Cont ++;
                        if (nueva[X - 1][Y - 1].getEstado() == true) Cont ++;
                        if (nueva[X][Y - 1].getEstado() == true) Cont ++;
                        if (nueva[X + 1][Y - 1].getEstado() == true) Cont++;
                        if (nueva[X + 1][Y].getEstado() == true) Cont++;
                    }else {
                        if (nueva[X - 1][Y - 1].getEstado() == true) Cont ++;
                        if (nueva[X - 1][Y].getEstado() == true) Cont ++;
                        if (nueva[X - 1][Y + 1].getEstado() == true) Cont ++;
                        if (nueva[X][Y + 1].getEstado() == true) Cont++;
                        if (nueva[X + 1][Y + 1].getEstado() == true) Cont++;
                        if (nueva[X + 1][Y].getEstado() == true) Cont++;
                        if (nueva[X + 1][Y - 1].getEstado() == true) Cont++;
                        if (nueva[X][Y - 1].getEstado() == true) Cont++;
                    }
                }
                if(Cont == 2 || Cont == 3) temp[X][Y] = CeldaVida;
                if(Cont < 2 || Cont > 3) temp[X][Y] = CeldaMuerta;
            } 
        }
        return temp;
    }
    
    /**
     * Metodo que encuentra celdas viva y las señala
     * @param nueva Recibe un vector de celdas
     * @return retorana el numero de celdas true
     */
    public int encuentraVivos(Celda[][] nueva) {
        int cont=0;
        for (int f = 0; f < nueva.length; f++) {
            for (int c = 0; c < nueva.length; c++) {
                if (nueva[f][c].getEstado() == true){
                        cont++;
                        System.out.println("num"+cont+"_("+f+","+c+")");
                }
            }
        }
        return cont;
    }
    
     /**
      * @param nueva de tipo matriz
      * Llena la matrix de celdas "muertas"
      * No retorna
      */
    public void fillMatrix(Celda[][]nueva){
         int cont=0;
        for (int fila = 0; fila < nueva.length; fila++) {
            for (int col=0 ; col <nueva.length; col++) { 
                //System.out.println("se esta llenando con celdas muertas");
                nueva[fila][col].setEstado(false);
            }
        }
    }    
}
