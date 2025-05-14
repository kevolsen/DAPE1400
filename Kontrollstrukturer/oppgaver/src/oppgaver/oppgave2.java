package oppgaver;

import javax.swing.*;

/*
Les inn en heltallsvariabel "alder".
Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende :

”Du kan ta førerkortet for bil da du er gammel nok” eller
”Du er for ung til å ta førerkort for bil”.

Gjør dette uten bruk av en else-setning (bruk to if-setninger).
 */

public class oppgave2 {
    public static void main(String[]args) {
        String ut="";
        int age = Integer.parseInt(JOptionPane.showInputDialog("Hvor gammel er du?"));
        if (age < 18) {
            ut = "Du kan ikke ta førerkort for bil.";
        }
        if (age >= 18) {
            ut = "Du kan ta førerkort for bil.";
        }
        JOptionPane.showMessageDialog(null, ut);
    }

}
