package aritmetikk;
import static javax.swing.JOptionPane.*;

public class Oppgave5 {
    public static void main(String[]args){
        try{
            double fahrenheit = Double.parseDouble(showInputDialog("Skriv inn grader i fahrenheit"));
            double celsius = (fahrenheit-32)/1.8;
            String celsiusTo = String.format("%.2f",celsius);

            System.out.println(fahrenheit+" "+celsius+" "+celsiusTo);
            showMessageDialog(null, fahrenheit+" gr i fahrenheit er "+celsiusTo+" gr i celsius.");
        }catch(Exception e){
            System.out.println("Error! " + e);
            showMessageDialog(null, "Error! Vennligst oppgi ett tall");
        }
    }
}
