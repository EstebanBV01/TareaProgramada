package JuegoDeLaVida.Datos;

/**
 *
 * @author EstebanBV, Fernanda, Juan Carlos
 * @version 28/10/2018
 */
public class Cuadricula {

    
    Celda[][] juego;
    public int SIZE=3;
    Celda c=new Celda(true);
   
    public Cuadricula(){
         this.juego = new Celda[SIZE][SIZE];
    }
    public Cuadricula(int cant) {
        this.juego = new Celda[cant][cant];
    }

    public void random(int cantDeCeldas) {
        for(int i=0;i<cantDeCeldas;i++){
//        int numero = (int) (Math.random() * juego.length) + 1;
//        int numero2 = (int) (Math.random() * juego.length) + 1;
       int numero = (int) (Math.random() * (juego.length -1));
       int numero2 = (int) (Math.random() * (juego.length -1));
        System.out.println(numero);
        System.out.println(numero2);
            this.juego[numero][numero2]=c;
        }
        }
    

    public int getSize() {
        return juego.length;
    }

    public Celda[][] getMatriz() {
        return juego;
    }

    public void setMatriz(Celda[][] newCelda) {
        this.juego = newCelda;
    }
}
