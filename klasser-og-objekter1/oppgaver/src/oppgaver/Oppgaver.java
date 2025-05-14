package oppgaver;

import javax.swing.*;

class Bok {
    private String tittel;
    private Double pris;
    private String forfatter;
    private int iSBN;


    public void sett(String tittelen, Double prisen, String forfatteren, int iSBNnummer) {
        tittel = tittelen;
        pris = prisen;
        forfatter = forfatteren;
        iSBN = iSBNnummer;

    }
    public String hentTittel() {
        return tittel;
    }
    public Double hentPris() {
        return pris;
    }
    public String hentForfatter() {
        return forfatter;
    }
    public int hentiSBN() {
        return iSBN;
    }

}

public class Oppgaver {
    public static void main(String[] args) {
        Bok nyBok = new Bok();

        String settTittel = JOptionPane.showInputDialog("Hva er tittelen på boka?");
        Double settPris = Double.parseDouble(JOptionPane.showInputDialog("Hva er prisen på boka?"));
        String settForfatter = JOptionPane.showInputDialog("Hvem er forfatteren?");
        int settiSBN = Integer.parseInt(JOptionPane.showInputDialog("Hva er iSBN-nummeret?"));

        nyBok.sett(settTittel, settPris, settForfatter, settiSBN);

        String bokTittel = nyBok.hentTittel();
        Double bokPris = nyBok.hentPris();
        String bokForfatter = nyBok.hentForfatter();
        int bokiSBN = nyBok.hentiSBN();

        JOptionPane.showMessageDialog(null,
                "Tittel: "+bokTittel+
                "\nPris: "+bokPris+
                "\nForfatter: "+bokForfatter+
                "\niSBN-nummer: "+bokiSBN
        );
    }

}
