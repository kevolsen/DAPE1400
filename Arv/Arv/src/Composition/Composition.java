package Composition;

class Person{
    public String navn;
    public String adresse;
    public String telefonnr;
}

//arv

class Student extends Person{

    public String sNummer;
    public String studieNavn;
}

class Ansatt extends Person {
    public String ansattVedInstitutt;
}

// composition

class Student1 {

    public String sNummer;
    public String studieNavn;
    public Person person;
}

class Ansatt1 {
    public String ansattVedInstitutt;
    public Person person;
}

public class Composition {

    public static void main(String[] args) {
        Student enStudent = new Student();
        enStudent.navn = "Ole";
        Student1 enAnnenStudent = new Student1();
        enAnnenStudent.person.navn = "Per";
        Ansatt1 enAnsatt = new Ansatt1();
        enAnsatt.person.navn = "Line";
        enAnsatt.ansattVedInstitutt="IT";
        Ansatt enAnnenAnsatt = new Ansatt();
        enAnnenAnsatt.navn = "Kari";
        enAnnenAnsatt.ansattVedInstitutt="MEK";
    }

}