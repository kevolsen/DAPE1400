package array;

import java.util.Arrays;

public class KlassenArrays {
    public static void main(String[]args) {
        double [] liste1 = {1.2,3.5,2.6,-3.6,5.6,10};

        Arrays.sort(liste1); // Sorterer liste1

        for(double tall:liste1) {
            System.out.print(tall+" ");
        }

        double [] liste2 = Arrays.copyOf(liste1, liste1.length); // Kopierer hele liste1 over i liste2, to forskjellige arrays

        double [] liste3 = liste2; // Ikke en kopi, men peker på samme objekt, endrer noe i liste3 blir også liste2 endret

        boolean b = Arrays.equals(liste2, liste1); // Returnerer true/false om liste1 er lik liste2

        int location = Arrays.binarySearch(liste1, 5.6); // Markerer hvilken posisjon 5.6 er på i liste1

        System.out.println("\n Indeksen til tallet 5.6 er: "+location);
    }
}
