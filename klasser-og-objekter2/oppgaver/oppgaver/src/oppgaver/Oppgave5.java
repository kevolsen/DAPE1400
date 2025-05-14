package oppgaver;

import javax.swing.*;

class Konto {
    private String navn;
    private String kontonr;
    private double saldo;

    public Konto(String navn, String kontonr, double saldo) {
        this.navn = navn;
        this.kontonr = kontonr;
        this.saldo = saldo;
    }

    public void kontoUtskrift() {
        String ut = "Navn: "+navn+"\nKontonummer: "+kontonr+"\nSaldo: "+String.format("%.2f",saldo);
        JOptionPane.showMessageDialog(null, ut);
    }

    public String settInn(double beløp) {
        saldo += beløp;
        return "Den nye saldoen er "+String.format("%.2f",saldo);
    }

    public String taUt(double beløp) {
        String ut ="";
        if(beløp <= saldo){
            saldo= saldo-beløp;
            ut = "Den nye saldoen er "+String.format("%.2f", saldo);
        } else {
            ut = "Ikke dekning på konto";
        }
        return ut;
    }

}

public class Oppgave5 {
    public static void main(String[] args) {
        String kontonavn = JOptionPane.showInputDialog("Angi kontonavn");
        String kontonr = JOptionPane.showInputDialog("Angi kontonummer");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Angi saldo"));
        Konto sparekonto = new Konto(kontonavn,kontonr,saldo);
        System.out.println(sparekonto.settInn(1000));
        System.out.println(sparekonto.taUt(10000));
        System.out.println(sparekonto.settInn(1000));
        sparekonto.kontoUtskrift();

    }
}
