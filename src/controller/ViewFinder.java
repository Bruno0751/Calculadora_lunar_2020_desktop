//calendario_lunar
package controller;
import javax.swing.JTextField;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 1
 * @since 5/12/2020
 */
public class ViewFinder {
    
    public void clear(JTextField name, JTextField day, JTextField month){
        name.setText("");
        day.setText("");
        month.setText("");
    }
}
