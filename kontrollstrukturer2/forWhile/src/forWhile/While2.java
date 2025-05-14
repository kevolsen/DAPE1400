package forWhile;

import javax.swing.*;

public class While2 {
    public static void main(String[] args) {

        int sum = 0;
        String input = JOptionPane.showInputDialog("Skriv inn et heltall og avslutt med 0");
        int innTall= Integer.parseInt(input);
        while(innTall > 0) {
            sum = sum + innTall;
            input = JOptionPane.showInputDialog("Skriv inn et heltall og avslutt med 0");
            innTall= Integer.parseInt(input);
        }
        JOptionPane.showMessageDialog(null, "Summen er : "+sum);
    }
}
