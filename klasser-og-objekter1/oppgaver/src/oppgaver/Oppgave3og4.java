package oppgaver;

import javax.swing.*;

class Person {
    public String navn;
    public String adresse;
    public String tlfnr;
    public int birthYear;

    public int alder() {
        return 2022 - birthYear;
    }

    public void skrivUt(int alder) {
        String ut = "Navn: "+navn+"\nAdresse: "+adresse+"\nTelefon nummer: "+tlfnr+"\nFødselsår: "+birthYear+"\nAlder: "+alder;
        JOptionPane.showMessageDialog(null,ut);
    }

}

public class Oppgave3og4 {
    public static void main(String[] args) {
        Person enPerson = new Person();
        enPerson.navn = JOptionPane.showInputDialog("Navn?");
        enPerson.adresse = JOptionPane.showInputDialog("Adresse?");
        enPerson.tlfnr = JOptionPane.showInputDialog("Telefon nummer?");
        enPerson.birthYear = Integer.parseInt(JOptionPane.showInputDialog("Fødselsår?"));
        int alder = enPerson.alder();
        enPerson.skrivUt(alder);
    }

}
