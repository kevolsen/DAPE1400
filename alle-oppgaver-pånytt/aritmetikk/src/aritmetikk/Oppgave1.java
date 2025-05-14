package aritmetikk;

import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main(String[]args){
        try {
            String navn = showInputDialog("Hva heter du?");
            int født = Integer.parseInt(showInputDialog("Hvilket år ble du født?"));
            int alder = 2022-født;
            int alder2053 = 2053-født;

            showMessageDialog(null,navn+" er i dag "+alder+" år. Hen er født i "+født+". I 2053 er hen "+alder2053+".");
        } catch(Exception e){
            System.out.println("Error "+e);
            showMessageDialog(null, "Error!");
        }

    }
}
