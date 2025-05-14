package ifsetninger;

import javax.swing.*;

public class IFsetninger1 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Fyll inn alderen din: ");
        int alder = Integer.parseInt(input);
        String out = "";
        if (alder < 13) {
            out = "Du er et barn.";
        } else if (alder < 18) {
            out = "Du er en ungdom.";
        } else if (alder < 70) {
            out = "Du er voksen.";
        } else {
            out = "Du er pensjonist.";
        }
        JOptionPane.showMessageDialog(null, out);
    }
}
