package konteEksamen2020;

public class Oppgave1 {
    public static void main(String[]args){
        int[] liste = {1,3,6,2,7,10,23,6,3,6};
        /* 1A
        for(int i=0;i<liste.length;i++){
           System.out.print(liste[i]+" ");
        } */ /* 1B
        for(int i=liste.length-1;i>=0;i--){
            System.out.print(liste[i]+" ");
        } */
        int sum=0; int i=0;
        while(i<liste.length){
            sum+=liste[i];
            i++;
        }
        System.out.println(sum);
    }
}
