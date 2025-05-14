package Interfaces;

interface Ansatt{
    public double lønn();
    public String getNavn();
}

class Selger implements Ansatt{
    private String navn;
    private double lønn;

    public Selger(String navn, double lønn) {
        this.navn = navn;
        this.lønn = lønn;
    }

    @Override
    public double lønn(){
        return lønn+30_000;
    }

    public String getNavn(){
        return this.navn;
    }
}

class Montør implements Ansatt{
    private String navn;
    private double lønn;

    public Montør(String navn, double lønn) {
        this.navn = navn;
        this.lønn = lønn;
    }

    public String getNavn(){
        return this.navn;
    }

    public double lønn(){
        return lønn;
    }
}


public class interfaces {
    public static void main(String[] args) {
        Ansatt enSelger = new Selger("Per Hansen",400_000);
        Ansatt enMontør = new Montør("Ole Olsen",300_000);

        Ansatt[] liste = new Ansatt[10];
        liste[0] = enSelger;
        liste[1] = enMontør;

        for (int i=0;i<liste.length && liste[i]!=null;i++){
            System.out.println(liste[i].getNavn()+" tjener "+liste[i].lønn());
        }
        // alternativt
        for (Ansatt enAnsatt : liste){
            if(enAnsatt!=null){
                System.out.println(enAnsatt.getNavn()+" tjener "+enAnsatt.lønn());
            }
        }
    }
}