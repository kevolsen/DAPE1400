import static javax.swing.JOptionPane.*;

public class oppgaver {
    public static void main(String [] args) {
        /* Oppgave 1
        String innAlder = showInputDialog("Hvor gammel er du?");
        int alder = Integer.parseInt(innAlder);
        showMessageDialog(null,"Du er "+alder+" år gammel!");
         */ /* Oppgave 2
        String innTall1 = showInputDialog("Skriv ett desimaltall");
        String innTall2 = showInputDialog("Skriv ett desimaltall til");
        String innTall3 = showInputDialog("ooog skriv ett desimaltall til");
        Double tall1 = Double.parseDouble(innTall1);
        Double tall2 = Double.parseDouble(innTall2);
        Double tall3 = Double.parseDouble(innTall3);
        System.out.println(tall1+tall2+tall3);
        */
        // Oppgave 3 & 4:
        String innTall1 = showInputDialog("Skriv ett desimaltall");
        String innTall2 = showInputDialog("Skriv ett desimaltall til");
        String innTall3 = showInputDialog("ooog skriv ett desimaltall til");
        Double tall1;
        Double tall2;
        Double tall3;
        try {
            tall1 = Double.parseDouble(innTall1);
            tall2 = Double.parseDouble(innTall2);
            tall3 = Double.parseDouble(innTall3);
        } catch(Exception e) {
            tall1 = 0.0;
            tall2 = 0.0;
            tall3 = 0.0;
        }
        Double tallene = tall1 + tall2 + tall3;
        System.out.println("Gjennomsnittet er " + tallene / 3 + "!");
        showMessageDialog(null, "Gjennomsnittet er " + tallene / 3 + "!");
    }
}
