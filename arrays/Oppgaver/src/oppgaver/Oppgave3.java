package oppgaver;

public class Oppgave3 {
    public static void main(String[]args) {
        String [] liste = {"Per", "Hansen", "Line", "Olsen", "Ola", "Pedersen", "Kari", "Finnsen"};
        for(int i = 0;i<liste.length;i++){
            System.out.print(liste[i]+" ");
            System.out.println(liste[i+1]);
            i++;
        }
    }
}
