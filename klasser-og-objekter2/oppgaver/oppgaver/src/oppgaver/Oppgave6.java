package oppgaver;

import javax.swing.*;

class vind {
    private double vindHastighet = 0.0;

    public vind(double vindHastighet) {
        this.vindHastighet = vindHastighet;
    }

    public double getVindHastighet() {
        return vindHastighet;
    }

    public boolean erOrkan() {
        if (vindHastighet >= 120) {
            return true;
        } else {
            return false;
        }
    }

    public boolean erVindstille() {
        if (vindHastighet <= 2) {
            return true;
        } else {
            return false;
        }
    }

    public double getKnop() {
        double knop = vindHastighet / 1.852;
        return knop;
    }

    public int getBeaufort() {
        double beaufort = (int)(Math.pow(vindHastighet/3.01,0.6666)+0.5);
        return (int)beaufort;
    }

}

public class Oppgave6 {
    public static void main(String[] args) {
        double vind = Double.parseDouble(JOptionPane.showInputDialog("Oppi vindhasigheten"));
        vind sjekkVind = new vind(vind);
        String ut = "Vindhasigheten er "+sjekkVind.getVindHastighet()+"\n";
        if(sjekkVind.erOrkan()) {
            ut+="Det er orkan.\n";
        } if(sjekkVind.erVindstille()) {
            ut+="Det er vindstille.\n";
        }
        String knop = String.format("%.2f",sjekkVind.getKnop());
        ut+="Det er "+knop+" knop.\n";
        ut+= "Og det tilsvarer "+sjekkVind.getBeaufort()+" på beaufort-skalaen.";
        JOptionPane.showMessageDialog(null, ut);
    }
}
