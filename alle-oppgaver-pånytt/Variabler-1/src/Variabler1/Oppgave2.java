package Variabler1;

import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    public static void main(String[]args){
        String fornavn = showInputDialog("Fornavn: ");
        String etternavn = showInputDialog("Etternavn:");
        Integer alder = Integer.parseInt(showInputDialog("Alder: "));

        showMessageDialog(null,fornavn+" "+etternavn+" er "+alder+" år gammel.");

    }
}
