package aritmetikk;

import static javax.swing.JOptionPane.*;

public class Oppgave3 {
    public static void main(String[] args) {
        try {
            Double areal, lengde, bredde;
            lengde = Double.parseDouble(showInputDialog("Lengde: "));
            bredde = Double.parseDouble(showInputDialog("Bredde: "));
            areal = lengde * bredde;

            showMessageDialog(null, "Et rektangel med bredde " + bredde + " cm og lengde " + lengde + " cm har et areal på " + areal + " cm^2");
            System.out.println(lengde + " " + bredde + " " + areal);
        } catch (Exception e) {
            System.out.println("Error! " + e);
            showMessageDialog(null, "Error! Vennligst oppgi to tall (bredde & lengde)");
        }
    }
}