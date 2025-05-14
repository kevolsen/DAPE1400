package oppgaver;

public class Oppgave2 {
    public static void main(String[]args) {
        int total = 0;
        int sum = 0;
        int teller=0;
        String ut = "";
        int [] nummer = {1,2,3,4,5,6,7,8,9};
        for(int i=0;i<nummer.length;i++) {
            total+=nummer[i];
        }
        for(int j:nummer) {
            if(j>5) {
                sum+=j;
                teller++;
            }
        }
        System.out.println("Summen av alle tallene blir: "+total+"\nGjennomsnittet blir: "+(double)total/nummer.length);
        System.out.println("\nSummen av alle tallene som er større enn 5 blir: "+sum+"\nGjennomsnittet blir: "+(double)sum/teller);
    }
}
