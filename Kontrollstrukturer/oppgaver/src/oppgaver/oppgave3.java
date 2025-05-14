package oppgaver;

import javax.swing.*;

/*
Gjør oppgave 2 ved hjelp av en else-setning (i tillegg til en if).
 */

public class oppgave3 {
    public static void main(String[]args) {
        String ut="";
        int age = Integer.parseInt(JOptionPane.showInputDialog("Hvor gammel er du?"));
        if (age < 18) {
            ut = "Du kan ikke ta førerkort for bil.";
        }
        else {
            ut = "Du kan ta førerkort for bil.";
        }
        JOptionPane.showMessageDialog(null, ut);
    }

}
