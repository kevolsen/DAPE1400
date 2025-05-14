package terning;
import java.security.SecureRandom;

public class Terning {
    public static void main(String[] args) {
        int antallKast = 1000;

        int terning1 = 0;
        int terning2 = 0;
        int terning3 = 0;
        int terning4 = 0;
        int terning5 = 0;
        int terning6 = 0;

        int kast;

        SecureRandom tilfeldigTall = new SecureRandom();

        // Kan også bruke if/else

        for (int i=0;i<antallKast;i++) {
            kast = tilfeldigTall.nextInt(6);
            kast++;
            switch(kast) {
                case 1:
                    terning1++;
                    break;
                case 2:
                    terning2++;
                    break;
                case 3:
                    terning3++;
                    break;
                case 4:
                    terning4++;
                    break;
                case 5:
                    terning5++;
                    break;
                case 6:
                    terning6++;
                    break;
            }
        }
        String ut = "";
        ut += "Antall 1'ere: "+terning1+"\n";
        ut += "Antall 2'ere: "+terning2+"\n";
        ut += "Antall 3'ere: "+terning3+"\n";
        ut += "Antall 4'ere: "+terning4+"\n";
        ut += "Antall 5'ere: "+terning5+"\n";
        ut += "Antall 6'ere: "+terning6+"\n";
        System.out.println(ut);
    }
}
