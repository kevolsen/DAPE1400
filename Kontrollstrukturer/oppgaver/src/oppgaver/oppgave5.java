package oppgaver;

/*
Lag et program som leser inn et månedsnavn. Så skal programmet skrive ut hvilken årstid det er. Reglene er:

Sommer : juni, juli, august
Høst : september, oktober, november
Vinter: desember, januar, februar,
Vår : mars, april, mai,

a) Lag først et program som løser det med if /else
b) Lag deretter et program som løser det med bruk av switch.
 */

import javax.swing.*;

public class oppgave5 {
    public static void main(String[] args) {
        String month = JOptionPane.showInputDialog("Hvilken måned er det?");
        String season = "";
        if (month.equals("juni") || month.equals("juli") || month.equals("august")) {
            season = "Sommer";
        } else if (month.equals("september") || month.equals("oktober") || month.equals("november")) {
            season = "Høst";
        } else if (month.equals("desember") || month.equals("januar") || month.equals("februar")) {
            season = "Vinter";
        } else if (month.equals("mars") || month.equals("april") || month.equals("mai")) {
            season = "Vår";
        } else {
            season = "0";
        }

        if (season.equals("0")) {
            JOptionPane.showMessageDialog(null, "Error! Vennligst skriv en kalendermåned i fulltekst. (F.eks. Januar)");
        } else {
            JOptionPane.showMessageDialog(null, "Det er " + month + " som betyr at det er " + season + "!");
        }
    }
}
