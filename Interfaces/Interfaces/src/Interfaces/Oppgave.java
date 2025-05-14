package Interfaces;

interface Kjøretøy {
        public String toString();
}

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

class Motorsykkel implements Kjøretøy{
    public String type;
    public Dato regDato;
    public String regnr;
    public Motorsykkel(String type, Dato regDato, String regnr){
        this.type = type;
        this.regDato = regDato;
        this.regnr = regnr;
    } public String toString(){
        return "Type: "+type+"\nReg. dato: "+regDato+"\nReg. nr.: "+regnr;
    }
}
class Bil implements Kjøretøy{
    public String type;
    public Dato regDato;
    public String regnr;
    public int lastekapasitet;
    public Bil(String type, Dato regDato, String regnr, int lastekapasitet){
        this.type=type;
        this.regDato=regDato;
        this.regnr=regnr;
        this.lastekapasitet=lastekapasitet;
    } public String toString(){
        return "Type: "+type+"\nReg. dato: "+regDato+"\nReg. nr.: "+regnr+"\nLastekapasitet: "+lastekapasitet;
    }
}

public class Oppgave {

    public static void main(String[] args) {
        Kjøretøy[] Kjøretøyet = new Kjøretøy[10];

        Dato dato1 = new Dato(10,12,2009);
        Dato dato2 = new Dato(28,02,2021);
        Kjøretøy Volvo = new Bil("Volvo",dato1,"AA112233",450);
        Kjøretøy Ducati = new Motorsykkel("Ducati",dato2,"BB332211");

        Kjøretøyet[0]=Volvo;
        Kjøretøyet[1]=Ducati;

        for(Kjøretøy etKjøretøy : Kjøretøyet){
            if(etKjøretøy!=null){
                System.out.println(etKjøretøy);
                System.out.println("------");
            }
        }

    }
}
