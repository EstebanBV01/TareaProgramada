package Ejemplo1;


/**
 *
 * @author Juan Carlos
 */
public class Main {

   
    public static void main(String[] args) {
        System.out.println(sumatoria(7));
                    

    }
    
        public static int sumatoria (int numb) {
            
            if (numb < 1) {
            return numb;
        }else {
            return numb + sumatoria(numb - 1);
            }
         
        }
        
        
}
