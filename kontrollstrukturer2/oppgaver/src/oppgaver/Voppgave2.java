package oppgaver;

public class Voppgave2 {
    public static void main(String[] args) {
        int n = 100;
        int i = 1;
        while(i <= n) {
            int c=0;
            for(int j=1;j<=i;j++) {
                if( i % j == 0) {
                    c++;
                }
            }
            if(c==2) {
                System.out.println(""+i);
            }
            i++;
        }
    }
}
