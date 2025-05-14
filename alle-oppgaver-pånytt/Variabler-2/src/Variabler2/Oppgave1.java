package Variabler2;

import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main(String[]args){
        try{
            Integer alder = Integer.parseInt(showInputDialog("Hvor gammel er du?"));
            showMessageDialog(null,"Du er "+alder+" år!");
            System.out.print(alder);
        } catch(Exception e){
            System.out.println("Error! "+e);
            showMessageDialog(null,"Error! Vennligst skriv inn alderen din (ett tall)");
        }
    }
}
