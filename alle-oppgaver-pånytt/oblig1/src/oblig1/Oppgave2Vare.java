package oblig1;

public class Oppgave2Vare {
    private String navn;
    private int antall;
    private double pris;

    public Oppgave2Vare(String navn, int antall, double pris){
        this.navn = navn;
        setAntall(antall);
        setPris(pris);
    }

    public double getPris(){
        return pris;
    }

    public void setPris(double pris){
        if(pris>0) {
            this.pris = pris;
        } else {
            this.pris=0;
        }
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        if(antall>0) {
            this.antall = antall;
        } else {
            this.antall=0;
        }
    }

    public double total(){
        return pris*antall;
    }

    // Konstruktør med alle attributter

    // get / set metoder
    // antall og pris må være større enn null

    // metode for å beregne totalpris (pris * antall)
}