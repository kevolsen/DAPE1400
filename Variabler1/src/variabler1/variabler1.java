package variabler1;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class variabler1 {

    public static void main(String[] args) {
        String innFornavn = showInputDialog("Skriv inn fornavnet ditt");
        String innEtternavn = showInputDialog("Skriv inn etternavnet ditt");
        String innAlder = showInputDialog("Hvor gammel er du?");
        String innAdresse = showInputDialog("Hva er adressen din?");
        String innPostnr = showInputDialog("Hva er postnummeret ditt?");
        String innPoststed = showInputDialog("Hva er poststedet ditt?");

        showMessageDialog(null,innFornavn+" "+innEtternavn+" bor i "+innAdresse+" som har postnummer "+innPostnr+" "+innPoststed+". "+innFornavn+" er "+innAlder+" år gammel.");
        showMessageDialog(null," Navn: " + innFornavn + " " + innEtternavn + "\n Adresse: " + innAdresse + "\n Postnummer: " + innPostnr + "\n Poststed: " + innPoststed + "\n Alder: " + innAlder);
        System.out.println(" Navn: " + innFornavn + " " + innEtternavn + "\n Adresse: " + innAdresse + "\n Postnummer: " + innPostnr + "\n Poststed: " + innPoststed + "\n Alder: " + innAlder);

    }
}
