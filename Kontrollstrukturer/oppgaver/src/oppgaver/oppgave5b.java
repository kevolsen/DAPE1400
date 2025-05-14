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

public class oppgave5b {
    public static void main(String[] args) {
        String month = JOptionPane.showInputDialog("Hvilken måned er det?");
        String season = "";

        switch(month) {
            case "juni":
            case "juli":
            case "august":
                season = "sommer";
                break;
            case "september":
            case "oktober":
            case "november":
                season = "høst";
                break;
            case "desember":
            case "januar":
            case "februar":
                season = "vinter";
                break;
            case "mars":
            case "april":
            case "mai":
                season = "vår";
                break;
            default:
                season = "0";
                break;
        }

        switch(season) {
            case "0":
                JOptionPane.showMessageDialog(null, "Error! Vennligst skriv en kalendermåned i fulltekst. (F.eks. Januar)");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Det er " + month + " som betyr at det er " + season + "!");
                break;
        }
    }
}
