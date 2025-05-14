package Variabler1;

import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main(String[]args){
        try {
            String fornavn = showInputDialog("Fornavn: ");
            String etternavn = showInputDialog("Etternavn:");

            showMessageDialog(null, fornavn + " " + etternavn);
        }
        catch(Exception e){
            showMessageDialog(null,"Error!");
        }
    }
}
