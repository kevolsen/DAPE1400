package Arv;

class Ansatt1 {
    private String navn;
    protected double lønn; // Se kommentar i Selger sin getLønn

    public Ansatt1(String navn, double lønn){
        this.navn=navn;
        this.lønn=lønn;
    }
    public String getNavn(){
        return this.navn;
    }
    public double getLønn(){
        return this.lønn;
    }
}
class Selger1 extends Ansatt {
    private static final double bonus = 30_000;

    public Selger1(String navn, double lønn){
        super(navn,lønn);
    }
    public double getLønn(){
        return super.getLønn()+bonus; // super.getLønn()+this.bonus ved private lønnsattributt
    }
}

class Montør1 extends Ansatt{

    public Montør1(String navn, double lønn){
        super(navn,lønn);
    }
}
public class Polyformisme {
    public static void main(String[]args){
        Ansatt Selger1 = new Selger1("Per Hansen",400_000);
        Ansatt Montør1 = new Montør1("Ole Olsen",300_000);

        Ansatt[] liste = new Ansatt[10];
        liste[0] = Selger1;
        liste[1] = Montør1;

        for(int i=0;i<liste.length && liste[i]!=null;i++){
            System.out.println(liste[i].getNavn()+" tjener "+liste[i].getLønn());
        }
    }
}
