
package DataBase;

/**
 *
 * @author Satellaizar
 */
public class CharElement {
    
    private char element;

    public CharElement(char element) {
        this.element = element;
    }

    public char getElement() {
        return element;
    }

    public void setElement(char element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "" + element;
    }
    
     
}
