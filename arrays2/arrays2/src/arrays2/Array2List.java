package arrays2;

import java.util.ArrayList;

class Bil {
    public String farge;
    public int [] verdier = new int[5];
}

public class Array2List {

    public static void main(String[] args) {
        ArrayList<Bil> biler = new ArrayList<Bil>(); // <> definerer klassen/typen, ArrayList er ikke statisk

        Bil enVolvo = new Bil();
        enVolvo.farge = "Rød";
        enVolvo.verdier[0]=4; // verier[0] er antall dører.
        enVolvo.verdier[1]=250; // verdier[1] er antall hk.

        Bil enAudi = new Bil();
        enAudi.farge = "Blå";
        enAudi.verdier[0]=5;
        enAudi.verdier[1]=345;

        biler.add(enAudi);
        biler.add(enVolvo);

        for(Bil enBil : biler) {
            System.out.println("Farge: "+enBil.farge);
            System.out.println("Antall dører: "+enBil.verdier[0]);
            System.out.println("Antall HK:"+enBil.verdier[1]);
            System.out.println("-----------------");
        }

        System.out.println("Lengden på arrayer er nå: "+biler.size());
        biler.clear();
        System.out.println("Lengden på arrayer er nå: "+biler.size());
    }

}
