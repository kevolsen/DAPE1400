package getset;

import javax.swing.*;

class Bil {
    private String farge;
    private int HK;

    public void setFarge(String farge) {
        this.farge = farge;
    }
    public String getFarge() {
        return farge;
    }
    public void setHK(int HK) {
        if (HK > 0) {
            this.HK = HK;
        } else {
            System.out.println("HK må være over 0.");
        }
    }
        public int getHK() {
            return HK;
        }
    }


public class getSet {
    public static void main(String[] args) {
        Bil nyBil = new Bil();
        nyBil.setFarge(JOptionPane.showInputDialog("Farge på bilen?"));
        String bilFargen = nyBil.getFarge();
        System.out.println("Fargen til bilen er "+bilFargen);
        nyBil.setHK(Integer.parseInt(JOptionPane.showInputDialog("HK?")));
        System.out.println("HK "+nyBil.getHK());
    }
}
