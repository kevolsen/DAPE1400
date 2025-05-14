package aritmetikk;
import javax.swing.*;

public class aritmetikk {
    public static void main(String[] args) {
/* Oppgave 1
        String innNavn = showInputDialog("Hva heter du?");
        String innAlder = showInputDialog("Hvor gammel er du?");

        int alder = Integer.parseInt(innAlder);
        int alder2 = 2020 - alder;
        int alder3 = alder + 30;

        JOptionPane.showMessageDialog(null, innNavn+" er i dag "+alder+ " år gammel. Hen er født i "+alder2+". I 2050 er hen "+alder3+" år gammel."); */

/* Oppgave 3
        String innBredde = showInputDialog("Hva er bredden til rektangelen?");
        String innLengde = showInputDialog("Hva er lengden til rektangelen?");

        Double bredde = Double.parseDouble(innBredde);
        Double lengde = Double.parseDouble(innLengde);
        Double sum = bredde * lengde;

        JOptionPane.showMessageDialog(null, "Et rektangel med bredde "+bredde+" cm og lengde "+lengde+" cm har et areal på "+sum+" cm^2."); */

/* Oppgave 4
        String innRadius = showInputDialog("Hva er bredden til rektangelen?");

        Double radius = Double.parseDouble(innRadius);
        Double omkrets = 2 * 3.14 * radius;
        String omkrets2 = String.format("%.2f", omkrets);

        JOptionPane.showMessageDialog(null,"Omkretsen av en sirkel med "+radius+" som radius blir "+omkrets2+" cm."); */

/* Oppgave 5
        String innFahrenheit = showInputDialog("Hvor mange grader fahrenheit er det?");

        Double fahrenheit = Double.parseDouble(innFahrenheit);
        Double celsius = (fahrenheit-32)/1.8;
        String celsius2 = String.format("%.2f", celsius);

        JOptionPane.showMessageDialog(null, "Når det er "+fahrenheit+" grader fahrenheit, er det "+celsius2+" grader celsius."); */

/* Oppgave 6
        String innUSD = showInputDialog("Hvor mye USD?");

        Double USD = Double.parseDouble(innUSD);
        Double NOK = USD * 10.1935;
        String NOK2 = String.format("%.2f", NOK);

        JOptionPane.showMessageDialog(null,USD+" USD er "+NOK2+" NOK."); */

/* Oppgave 7
        String innPersoner = showInputDialog("Hvor mange personer er dere?");
        String innPizzaer = showInputDialog("Hvor mange pizzaer har dere?");

        int personer = Integer.parseInt(innPersoner);
        int pizzaer = Integer.parseInt(innPizzaer);
        int pizzaPers = 6 * pizzaer / personer;
        int pizzaPers2 = 6 * pizzaer % personer;
        JOptionPane.showMessageDialog(null,"Dersom man er "+personer+" personer og har "+pizzaer+" pizzaer får hver person "+pizzaPers+" slices og "+pizzaPers2+" blir til overs.");
         */

/* Oppgave 8
        int resultat = 1 * 4 + (2 * 2 + 1 ) / (2-1*3);
        System.out.println(resultat); */

/* Oppgave 9
Hva gir de ulike logiske uttrykkene under (anngi om de blir true eller false etter kolon):
        sett tall1 = 5
        sett tall2 = 4
        tall1 == tall2 : false
        tall1 != tall2 : true
        tall1 <= tall2 : false
        tall1 >= tall2 : true
        tall1 < tall2  : false
        tall1 > tall2  : true
 */ /* Oppgave 10
        String innAlder = JOptionPane.showInputDialog("Hvor gammel er du?");
        int alder = Integer.parseInt(innAlder);
        if (alder >= 18){
            JOptionPane.showMessageDialog(null,"Du kan ta førerkortet for bil da du er gammel nok.");
        }
        if (alder < 18){
            JOptionPane.showMessageDialog(null,"Du er for ung til å ta førerkort for bil.");
        } */

/* Oppgave 11
        String innTall = JOptionPane.showInputDialog("Skriv et tall!");
        int Tall = Integer.parseInt(innTall);
        int Tall1 = Tall % 10;
        int Tall2 = Tall / 10 % 10;
        int Tall3 = Tall/10/10 % 10;
        int Tall4 = Tall/10/10/10 % 10;
        int sum = Tall1+Tall2+Tall3+Tall4;

        JOptionPane.showMessageDialog(null, Tall4+" + "+Tall3+" + "+Tall2+" + "+Tall1+" = "+sum);
*/

    }
}
