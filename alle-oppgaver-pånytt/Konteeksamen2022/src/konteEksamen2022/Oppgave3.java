package konteEksamen2022;

class Personalia {
    String navn;
    String adresse;
    String telefonnr;

    public Personalia(String navn, String adresse, String telefonnr){
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }
}

class Student extends Personalia {
    private String studentnr;
    public Student(String navn, String adresse, String telefonnr, String studentnr) {
        super(navn, adresse, telefonnr);
        this.studentnr = studentnr;
    }
    public String toString(){
        return "Navn: "+navn+"\n"+
                "Adresse: "+adresse+"\n"+
                "Telefonnr: "+telefonnr+"\n"+
                "Studentnr: "+studentnr;
    }
}

class Ansatt extends Personalia {
    private String tittel;
    public Ansatt(String navn, String adresse, String telefonnr, String tittel) {
        super(navn, adresse, telefonnr);
        this.tittel = tittel;
    }
    public String toString(){
        return "Navn: "+navn+"\n"+
                "Adresse: "+adresse+"\n"+
                "Telefonnr: "+telefonnr+"\n"+
                "Tittel: "+tittel;
    }
}

public class Oppgave3 {
    public static void main(String[]args){
        Personalia[] nyPerson = new Personalia[10];
        Ansatt Pål = new Ansatt("Pål","Ahus","2222 5555","Foreleser");
        Student Ole = new Student("Ole","Bærum","12345678","s123456");

        nyPerson[0] = Pål;
        nyPerson[1] = Ole;

        for(int i=0;i< nyPerson.length;i++){
            if(nyPerson[i] != null) {
                System.out.println(nyPerson[i]);
                System.out.println("----");
            }
        }
    }
}
