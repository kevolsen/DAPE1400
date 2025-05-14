package oppgaver;
import java.util.Arrays;

public class Oppgave5 {
    public static void main(String[]args){
        int [] liste = {45, 34, 5, 8, 10, 2, 13, 25};
        int største = liste[0];
        for (int i:liste) {
            if (i > største) {
                største = i;
            }
        }
        Arrays.sort(liste);
        System.out.print(liste[0]+" "+ største);
    }
}
