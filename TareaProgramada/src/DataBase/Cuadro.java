
package DataBase;
import javax.swing.JButton;

/**
 *
 * @author Esteban
 */
public class Cuadro extends JButton{
    
    private CharElement element;
    
    public Cuadro(CharElement element) {
        super(element.toString());
    }
    
    public CharElement getCharElement() {
        return this.element;
    }
}
