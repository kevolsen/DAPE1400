package oppgaver;

import javax.swing.*;

/*
Definer så en variabel som indikerer høyeste alder man kan ta førerkort uten årlig legesjekk (= 70 år). Oppdater oppgavene over slik at programmet skriver ut meldingene

Du er for ung til å ta førerkort for bil
Du kan ta førerkort for bil og du trenger ikke årlige legesjekker
Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker
 */

public class oppgave4 {
    public static void main(String[]args) {
        String ut="";
        int age = Integer.parseInt(JOptionPane.showInputDialog("Hvor gammel er du?"));
        if (age < 18) {
            ut = "Du er for ung til å ta førerkort for bil";
        }
        else if (age >= 70) {
            ut = "Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker";
        } else {
            ut = "Du kan ta førerkort for bil og du trenger ikke årlige legesjekker";
        }
        JOptionPane.showMessageDialog(null, ut);
    }

}
