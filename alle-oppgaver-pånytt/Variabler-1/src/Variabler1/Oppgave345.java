package Variabler1;

import static javax.swing.JOptionPane.*;

public class Oppgave345 {
    public static void main(String[]args){
        try {
            String fornavn = showInputDialog("Fornavn: ");
            String etternavn = showInputDialog("Etternavn:");
            String alder = showInputDialog("Alder: ");
            String adr = showInputDialog("Adresse: ");
            String postnr = showInputDialog("Postnr.: ");
            String poststed = showInputDialog("Poststed: ");

            showMessageDialog(null, "Navn: "+fornavn+" "+etternavn+"\n"+
                            "Alder: "+alder+"\n"+
                            "Adresse: "+adr+"\n"+
                            "Postnr.: "+postnr+"\n"+
                            "Poststed: "+poststed+"\n"
                    );

            System.out.print("Navn: "+fornavn+" "+etternavn+"\n"+
                    "Alder: "+alder+"\n"+
                    "Adresse: "+adr+"\n"+
                    "Postnr.: "+postnr+"\n"+
                    "Poststed: "+poststed+"\n");


        }catch(Exception e){
            showMessageDialog(null,"Error!");
            System.out.println("Error! "+e);
        }
    }
}
