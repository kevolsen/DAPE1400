package konteEksamen2020;

class Bok{
    private String tittel;
    private Forfatter forfatter;

    public Bok(String tittel, Forfatter forfatter){
        setForfatter(forfatter);
        setTittel(tittel);
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public Forfatter getForfatter() {
        return forfatter;
    }

    public void setForfatter(Forfatter forfatter) {
        this.forfatter = forfatter;
    }

    public String toString(){
        return "Tittel: "+getTittel()+"\nForfatter:\n"+getForfatter();
    }
}

 class Forfatter {
    private String navn;
    private String født;

    public Forfatter(String navn, String født){
        setNavn(navn);
        setFødt(født);
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getFødt() {
        return født;
    }

    public void setFødt(String født) {
        this.født = født;
    }

    public String toString(){
        return "Navn: "+getNavn()+"\nFødt: "+getFødt();
    }
}

public class Oppgave3 {
    public static void main(String[]args){
        Forfatter[] enForfatter = new Forfatter[10];
        enForfatter[0] = new Forfatter("Roald Dahl","13/11/1916");
        Bok[] enBok = new Bok[10];
        enBok[0] = new Bok("Matilda",enForfatter[0]);
        enBok[1] = new Bok("En annen bok",enForfatter[0]);

        System.out.println("Liste over forfattere: \n");
        for(int i=0;i < enForfatter.length;i++){
            if(enForfatter[i]!=null){
                System.out.println(enForfatter[i]);
                System.out.println("-----");
            }
        }

        System.out.println("\nListe over bøker: \n");
        for(int i=0;i < enBok.length;i++){
            if(enBok[i]!=null){
                System.out.println(enBok[i]);
                System.out.println("-----");
            }
        }
    }
}
