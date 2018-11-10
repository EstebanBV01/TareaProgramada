
package JuegoDeLaVida.Logico;

import JuegoDeLaVida.Datos.Cuadricula;
import JuegoDeLaVida.Datos.Celda;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban BV, Fernanda AA, Juan Carlos VA
 * @version 
 */
public class Reglas {
    
    
    
    /**public Cuadricula tamañoMatriz (int tamaño) {
        Celda[][] temp = new Celda[tamaño][tamaño];
         for (int f = 0; f < matrizC.getMatriz().length; f++) {
           for (int c = 0; c < matrizC.getMatriz().length; c++) {
            temp[f][c] = matrizC.getMatriz()[f][c];
           }
        } 
         matrizC.setMatriz(temp);
         return matrizC;
    }**/
 
    /**
     * 
     * @param nueva de tipo Matriz
     * Metodo para la validacion de celdas vecinas
     * No 
     */
    public void Rules (Celda[][] nueva) {
        int Cont;
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
                        if (nueva[X + 1][Y + 1].getEstado() == true) Cont++;
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
                    }else if (Y == nueva[X].length) {
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
                
                if(Cont == 2 || Cont == 3) nueva[X][Y].setEstado(true);
                if(Cont < 2 || Cont > 3) nueva[X][Y].setEstado(false);
                
            } 
        }
    }
      public void encuentraVivos(Celda[][] nueva) {
        int cont=0;
        for (int f = 0; f < nueva.length; f++) {
            for (int c = 0; c < nueva.length; c++) {
                if (nueva[f][c].getEstado() == true){
                        cont++;
                        System.out.println("num"+cont+"_("+f+","+c+")");
                }
            }
       }
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
                System.out.println("se esta llenando con celdas muertas");
                nueva[fila][col].setEstado(false);
            }
        }
    }    
//    public void Encuentra (Celda[][] nueva) {
//       for (int f = 0; f < nueva.length; f++) {
//           for (int c = 0; c < nueva.length; c++) {
//                if (nueva[f][c].getEstado() == true);
////                    for (int i = f; i <f+1; i++) {
////                        for (int j = c; j < c+1; j++) {
////                            if (nueva[f][c].getEstado() == true) {
//                                
//                            }
//                        }
////                    }
////            }
////       }
//    }
    
    
}
