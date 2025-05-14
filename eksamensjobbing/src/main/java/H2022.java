class Bok {
    private String tittel;
    private String forfatter;
    private double pris;

    public Bok(String tittel, String forfatter, double pris) {
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.pris = pris;
    }

    public String toString() {
        return "Tittel= " + tittel + ", Forfatter=" + forfatter + ", Pris=" pris;

    }
}

    static class Lydbok extends Bok {
        int lengdeiminutter;

    }

public class H2022 {

    /* Oppgave 4
    class KonverterTemperatur {
        public static double tilCelsius(double a) {
            return ((a-32)/1.8);
        }

        public static double tilFahrenheiht(double a){
            return a*1.8+32;
        }
    }

     */

/* Oppgave 2
    class Liste{
        public static int overNull(int[] a){
            int teller=0;
            for(int i=0;i<a.length;++i){
                if(a[i]>0){
                    ++teller;
                }
            }
            return teller;
        }
        public static int antallForekomster(int[] a, int b){
            int teller=0;
            for(int i=0;i<a.length;++i){
                if(b==a[i]){
                    ++teller;
                }
            }
            return teller;
        }
        public static int storsteVerdi(int[] a){
            int stor=a[0];
            for(int i=1;i<a.length;++i){
                if(stor<a[i]){
                    stor=a[i];
                }
            }
            return stor;
        }
    }
 */

    public static void main(String [] args){

        /* Oppgave 4
        double a=25;
        System.out.println(KonverterTemperatur.tilCelsius(a));
        System.out.println(KonverterTemperatur.tilFahrenheiht(a));
        */

        /* Oppgave 3
        double vekt,høyde;
        String innVekt= JOptionPane.showInputDialog("Skriv inn vekten din i kg");
        String innHøyde= JOptionPane.showInputDialog("Skriv inn høyden din i cm");

        try{
            vekt = Double.parseDouble(innVekt);
            høyde = Double.parseDouble(innHøyde);
        } catch(Exception e){
            vekt=0;
            høyde=0;
        }

        if(vekt>= 0 || høyde >= 0) {
            JOptionPane.showMessageDialog(null, "Vennligst skriv inn kun tall over 0 i vekt & høyde");
        } else {

        double temp = (1.3*vekt)/(høyde/100);
        double BMI = Math.pow(temp, 2.5);


            JOptionPane.showMessageDialog(null, "Din BMI er " + String.format("%.2f", BMI));
        }

         */

        /* Oppgave 2
        int[] a={1,2,3,2};
        int b=2;
        System.out.println("Antall tall over null: "+Liste.overNull(a));
        System.out.println("Tallet forekommer "+Liste.antallForekomster(a,b)+" ganger.");
        System.out.println("Det største tallet i tabellen er: "+Liste.storsteVerdi(a));
*/

/* Oppgave 1
        int[] a={-3,41,5,-3,2,49};
        int teller=0;
        for(int i=0;i<a.length;++i) {
            if (a[i] > 10) {
                ++teller;
            }
        }
        System.out.println("Antall tall som er større enn 10: "+teller);
        System.out.print("Annet hvert tall i tabellen: ");
        for(int k=0;k<a.length;k=k+2){
            System.out.print(a[k]+" ");
        }
        System.out.println();
        System.out.print("Alle positive tall i tabellen: ");
        int y=0; int x=0;
        for(int j=0;j<a.length;++j){
            if(a[j]>0){
                System.out.print(a[j]+" ");
                x+=a[j];
                ++y;
            }
        }
        System.out.println();
        System.out.print("Gjennomsnittet av de positive tallene i tabellen er: "+ x/y);

 */




    }

    }
