package aritmetikk;
import static javax.swing.JOptionPane.*;

public class Oppgave6 {
    public static void main(String[]args){
        try{
            double USD = Double.parseDouble(showInputDialog("USD: "));
            double NOK = USD*10.0054;
            String NOKto = String.format("%.2f",NOK);

            System.out.println(USD+" "+NOK+" "+NOKto);
            showMessageDialog(null, USD+" USD er "+NOKto+" NOK.");
        }catch(Exception e){
            System.out.println("Error! " + e);
            showMessageDialog(null, "Error! Vennligst oppgi ett tall");
        }
    }
}
