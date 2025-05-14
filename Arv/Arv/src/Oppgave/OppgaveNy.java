package Oppgave;

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
        return this.dag+" "+månedsnavn(this.måned)+" "+this.år;
    }
}

class Bil extends Kjøretøy {
    public int lastekapasitet;
    public Bil(String type, Dato dato, String skilt, int lastekapasitet){
        super(type,dato,skilt);
        this.lastekapasitet=lastekapasitet;
    }
    public String toString(){
        return "Type: "+type+"\nReg.dato: "+dato+"\nReg.nr.: "+skilt+"\nLastekapasitet: "+lastekapasitet;
    }
}

class Motorsykkel extends Kjøretøy {
    public Motorsykkel(String type, Dato dato, String skilt){
        super(type,dato,skilt);
    } public String toString(){
        return "Type: "+type+"\nReg.dato: "+dato+"\nReg.nr.: "+skilt;
    }
}


class Kjøretøy {
    public String type;
    public Dato dato;
    public String skilt;

    public Kjøretøy(String type, Dato dato, String skilt) {
        this.type = type;
        this.dato = dato;
        this.skilt = skilt;
    }
}



    // opprett følgende attributter
    // typebetegnelse f.eks Audi A6
    // førstegangsregistrert av type Dato
    // kjennetegn dvs. skiltnummer

    // lag også konstruktør for alle attributtene

    // lag så en toString metode for å vise alle attributtene

public class OppgaveNy {

    public static void main(String[] args) {
        Kjøretøy[] Kjøretøyet = new Kjøretøy[100];

        Dato dato1 = new Dato(12,5,2017);
        Kjøretøy Volvo = new Bil("Volvo",dato1,"AA12345",450);

        Dato dato2 = new Dato(17,12,2021);
        Kjøretøy BMW = new Motorsykkel("BMW",dato2,"BB666");

        Kjøretøyet[0]=Volvo;
        Kjøretøyet[1]=BMW;

        for(Kjøretøy etKjøretøy: Kjøretøyet){
            if(etKjøretøy!=null){
                System.out.println(etKjøretøy);
                System.out.println("-----");
            }
        }


        // opprett et array av Biler

        // Sett inn noen biler i arrayet

        // List motorvognregisteret (arrayet) ved hjelp av en løkke

    }
}