package aritmetikk;
import static javax.swing.JOptionPane.*;

public class Oppgave11 {
    public static void main(String[]args){
        try{
            int tall = Integer.parseInt(showInputDialog("Skriv inn ett tall mellom 0 og 999"));
            int tall1 = tall % 10; // TALL 1
            int tall2 = (tall-tall1)/10;
            int tall3 = tall2 % 10; // TALL 2
            int tall4 = (tall2-tall3)/10; // TALL 3
            int sum = tall1+tall3+tall4;
            if(tall<0 || tall>999){
                showMessageDialog(null,"Tallet må være mellom 0 og 999!");
            } else {
                showMessageDialog(null,"Tallet ditt: "+tall+"\nTverrsummen: "+tall4+" + "+tall3+" + "+tall1+" = "+sum);
            }
        }catch(Exception e){
            System.out.println("Error! " + e);
            showMessageDialog(null, "Error!");
        }
    }
}
