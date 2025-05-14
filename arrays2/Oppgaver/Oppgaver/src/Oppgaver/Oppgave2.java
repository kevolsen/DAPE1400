package Oppgaver;
import java.util.ArrayList;

public class Oppgave2 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        for (int i=1;i<12;i++) {
            liste.add(i);
        }
        liste.remove(1);
        liste.remove(1);

        for(int j=0;j<liste.size();j++) {
            System.out.println(liste.get(j));
        }
    }
}
