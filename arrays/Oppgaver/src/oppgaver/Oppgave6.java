package oppgaver;
import java.util.Arrays;
import javax.swing.*;

public class Oppgave6 {
    public static void main(String[]args){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn det første tallet"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn det andre tallet"));
        int [] liste = {a,b};
        int tallA = liste[0];
        int tallB = liste[0];
        for(int i:liste) {
            if (i > liste[0]){
                tallA = i;
            }
            if(i < liste[0]){
                tallB = i;
            }
        }
        if(tallA == tallB) {
            JOptionPane.showMessageDialog(null,"Tallene "+tallA+ " og "+tallB+ " er like!");
        } else {
            JOptionPane.showMessageDialog(null,"Tallene "+tallA+ " og "+tallB+ " er ikke like!");
        }
    }
}
