package aritmetikk;

public class Oppgave2 {
    public static void main(String[]args){
        try {
            for (int i = 2; i < 10; i += 2) {
                System.out.println(i);
            }
        }catch(Exception e){
            System.out.println("Error "+e);
        }
    }
}
