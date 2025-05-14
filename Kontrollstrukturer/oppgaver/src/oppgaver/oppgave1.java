package oppgaver;

import javax.swing.*;

public class oppgave1 {

    /* Les inn en heltallsvariabel. Skriv så ut en tekst ”Du er myndig men kan ikke kjøpe alkohol med mer enn 22 % på
    polet”. Dvs. at du må ha en beslutning som tester på om alderen eller mellom 18 og 20. Dersom dette ikke er tilfelle
    skriv ut ”Du er enten umyndig eller så kan du kjøpe hva du vil på polet”. */

    public static void main(String[]args) {
        String ut;
        int age = Integer.parseInt(JOptionPane.showInputDialog("Hvor gammel er du?"));

        if (age < 18) {
            ut = "Du er under 18 år gammel, og umyndig.";
        } else if (age < 21) {
            ut = "Du er myndig men kan ikke kjøpe alkohol med mer enn 22%.";
        } else {
            ut = "Du er myndig og kan kjøpe hva du vil av alkohol.";
        }
        JOptionPane.showMessageDialog(null, ut);
    }

}
