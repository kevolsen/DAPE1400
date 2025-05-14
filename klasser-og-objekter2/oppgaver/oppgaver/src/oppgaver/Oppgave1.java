package oppgaver;

import javax.swing.*;

class Person {
    private String fornavn;
    private String etternavn;
    private String adresse;
    private int tlfnr;

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }
    public String getFornavn() {
        return fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }
    public String getEtternavn() {
        return etternavn;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getAdresse() {
        return adresse;
    }

    public void setTlfnr(int tlfnr) {
        this.tlfnr = tlfnr;
    }
    public int getTlfnr() {
        return tlfnr;
    }
}

public class Oppgave1 {
    public static void main(String[] args) {
        Person nyPerson = new Person();

        nyPerson.setFornavn(JOptionPane.showInputDialog("Fornavn?"));
        String fornavnet = nyPerson.getFornavn();

        nyPerson.setEtternavn(JOptionPane.showInputDialog("Etternavn?"));
        String etternavnet = nyPerson.getEtternavn();

        nyPerson.setAdresse(JOptionPane.showInputDialog("Adresse?"));
        String adressen = nyPerson.getAdresse();

        nyPerson.setTlfnr(Integer.parseInt(JOptionPane.showInputDialog("Telefon nummer?")));
        Integer tlfnret = nyPerson.getTlfnr();

        JOptionPane.showMessageDialog(null, "Fornavn: "+fornavnet+"\nEtternavn: "+etternavnet+"\nAdresse: "+adressen+"\nTelefon nummer: "+tlfnret);
    }
}
