package oblig2;
import static javax.swing.JOptionPane.*;

public class oppgave1 {
    public static void main(String[]args){
        int nedreGrense = 0;
        int øvreGrense = 0;
        while(nedreGrense>=øvreGrense) {
            try {
                øvreGrense = Integer.parseInt(showInputDialog("Øvre grense"));
                nedreGrense = Integer.parseInt(showInputDialog("Nedre grense"));
            } catch (Exception e) {
                showMessageDialog(null, "Error!");
            }
        }
        int teller=0; int sum=0;
        for(int i=nedreGrense;i<øvreGrense;i++){
            if(teller==10){
                System.out.print("\n");
                teller=0;
            } teller++;
            sum+=i;
            System.out.print(i+"+");
        }
        sum+=øvreGrense;
        System.out.print(øvreGrense+" ="+ sum);
    }
}
