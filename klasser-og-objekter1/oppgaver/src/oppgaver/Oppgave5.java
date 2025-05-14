package oppgaver;
import javax.swing.*;

class Kalkulator {
    Double number1;
    Double number2;
    String type;
}

public class Oppgave5 {
    public static void main(String[] args) {
        try {
            Kalkulator enKalkulator = new Kalkulator();
            enKalkulator.type = JOptionPane.showInputDialog("Type? (/, +, -, *)");
            enKalkulator.number1 = Double.parseDouble(JOptionPane.showInputDialog("Nummer 1"));
            enKalkulator.number2 = Double.parseDouble(JOptionPane.showInputDialog("Nummer 2"));
            Double nummer1 = enKalkulator.number1;
            Double nummer2 = enKalkulator.number2;
            String typen = enKalkulator.type;

            if (typen.equals("+")) {
                Double result = nummer1 + nummer2;
                System.out.println(nummer1 + " + " + nummer2 + " = " + result);
            } else if (typen.equals("-")) {
                Double result = nummer1 - nummer2;
                System.out.println(nummer1 + " - " + nummer2 + " = " + result);
            } else if (typen.equals("/")) {
                Double result = nummer1 / nummer2;
                System.out.println(nummer1 + " / " + nummer2 + " = " + result);
            } else if (typen.equals("*")) {
                Double result = nummer1 * nummer2;
                System.out.println(nummer1 + " * " + nummer2 + " = " + result);
            } else {
                System.out.println("The type has to be + , - , * or /");
            }
       } catch (Exception e) {
            System.out.println("Sum ting went wong.");
        }
    }
}
