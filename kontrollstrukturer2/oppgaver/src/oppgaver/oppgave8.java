package oppgaver;

public class oppgave8 {
    public static void main(String[]args) {
        int i=0;
        int antall=0;
        while(i<100) {
            antall+=i;
            i+=2;
        }
        double gjennomsnitt = (double)antall / (double)100;
        System.out.print("Antall: "+antall+"\nGjennomsnitt: "+gjennomsnitt);
    }
}
