package aritmetikk;
import static javax.swing.JOptionPane.*;

public class Oppgave7 {
    public static void main(String[]args){
        int pizza,personer,antallSlices,slicesPerPers,slicesLeft;
         pizza = Integer.parseInt(showInputDialog("Antall pizza(er): "));
         personer = Integer.parseInt(showInputDialog("Antall person(er): "));
         antallSlices = Integer.parseInt(showInputDialog("Antall slices per pizza? "));
         slicesPerPers = (pizza*antallSlices)/personer;
         slicesLeft = pizza % personer;

        showMessageDialog(null, "Hvis "+personer+" personer har "+pizza+" stk pizzaer, og hver pizza har "+antallSlices+ " biter, får hver person "+slicesPerPers+" biter hver og det er igjen "+slicesLeft+" biter.");

    }
}
