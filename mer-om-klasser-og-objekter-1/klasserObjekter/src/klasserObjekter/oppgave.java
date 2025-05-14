package klasserObjekter;

class Dato {
    private int dag, måned, år;

    public Dato( int dag, int måned, int år ) {
        this.dag = dag;
        this.måned = måned;
        this.år =år;
    }

    private static String månedsnavn( int mnd ) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if ( mnd > 0 && mnd < 13 )
            return navn[ mnd - 1 ];
        else
            return "ukjent måned";
    }

    public String toString(){
        return dag+" "+månedsnavn(måned)+" "+år;
    }
}

class Bilen {
    public String type;
    public Dato dato;
    public String kjennetegn;

    public Bilen(String type, Dato dato, String kjennetegn){
        this.type = type;
        this.dato = dato;
        this.kjennetegn = kjennetegn;
    }

    public String toString() {
        String ut = "Type: "+type+"\n";
        ut+= "Førstegangsregistrert: "+dato+"\n";
        ut+= "Kjennetegn: "+kjennetegn;
        return ut;
    }


    // opprett følgende attributter
    // typebetegnelse f.eks Audi A6
    // førstegangsregistrert av type Dato
    // kjennetegn dvs. skiltnummer

    // lag også konstruktør for alle attributtene

    // lag så en toString metode for å vise alle attributtene

}

public class oppgave {

    public static void main(String[] args) {
        Bilen [] nyBil = new Bilen[100];

        Dato dato1 = new Dato(10,1,2022);
        Dato dato2 = new Dato(24,5,2022);

        Bilen Volvo = new Bilen("volvo",dato1,"AA12345");
        Bilen Audi = new Bilen("Audi",dato2,"BB54321");

        nyBil[0] = Volvo;
        nyBil[1] = Audi;

        for(Bilen Bilen : nyBil){
            if(Bilen !=null) {
                System.out.println(Bilen);
                System.out.println("---");
            }
        }

        // opprett et array av Biler

        // Sett inn noen biler i arrayet

        // List motorvognregisteret (arrayet) ved hjelp av en løkke

    }
}
