package aritmetikk;

import static javax.swing.JOptionPane.*;

public class Oppgave10 {
    public static void main(String[]args){
        try{
            int alder = Integer.parseInt(showInputDialog("Hvor gammel er du?"));
            if(alder>=18){
                showMessageDialog(null, "Du er gammel nok til å ta førerkort!");
            } else if(alder>=16){
                showMessageDialog(null, "Du er gammel nok til å øvelseskjøre!");
            } else {
                showMessageDialog(null, "Du er ikke gammel nok til å kjøre bil!");
            }
        }catch(Exception e){
            System.out.println("Error! " + e);
            showMessageDialog(null, "Error! Vennligst oppgi ett tall");
        }
    }
}
