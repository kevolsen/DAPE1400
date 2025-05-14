package Variabler2;

import static javax.swing.JOptionPane.*;

public class Oppgave234 {
    public static void main(String[]args){
        try{
            double tall1 = Double.parseDouble(showInputDialog("Skriv inn et desmialtall"));
            double tall2 = Double.parseDouble(showInputDialog("Skriv inn et desmialtall til"));
            double tall3 = Double.parseDouble(showInputDialog("Oooog skriv inn et siste desmialtall"));

            double sum = tall1+tall2+tall3;
            double gjennoms = sum/3;

            showMessageDialog(null,"Dine tall: "+tall1+", "+tall2+", "+tall3+"\n"+
                    "Summen av tallene: "+sum+"\n"+
                    "Gjennomsnittet av tallene: "+gjennoms);
            System.out.print("Dine tall: "+tall1+", "+tall2+", "+tall3+"\n"+
                    "Summen av tallene: "+sum+"\n"+
                    "Gjennomsnittet av tallene: "+gjennoms);
        } catch(Exception e){
            System.out.println("Error! "+e);
            showMessageDialog(null,"Error! Vennligst skriv inn tre desimaltall");
        }
    }
}
