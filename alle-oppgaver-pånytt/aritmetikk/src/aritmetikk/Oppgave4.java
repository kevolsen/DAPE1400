package aritmetikk;

import static javax.swing.JOptionPane.*;

public class Oppgave4 {
    public static void main(String[] args) {
        try {
            Double omkrets, radius;
            radius = Double.parseDouble(showInputDialog("Radius: "));
            omkrets = 2*3.14*radius;
            String omkretsToDes = String.format("%.2f",omkrets);

            showMessageDialog(null, "Omkretsen av en sirkel med "+radius+" som radius blir "+omkretsToDes+" cm,");
            System.out.println(radius + omkretsToDes);
        } catch (Exception e) {
            System.out.println("Error! " + e);
            showMessageDialog(null, "Error! Vennligst oppgi ett tall (radius)");
        }
    }
}