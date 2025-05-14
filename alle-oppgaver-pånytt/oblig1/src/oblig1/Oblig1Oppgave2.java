package oblig1;
import static javax.swing.JOptionPane.*;

public class Oblig1Oppgave2 {
      public static void main(String[]args){
          String Varenavn1 = showInputDialog("Navn på vare nr. 1");
          String innAntall1 = showInputDialog("Antall varer: ");
          String innpris1 = showInputDialog("Pris: ");

          String Varenavn2 = showInputDialog("Navn på vare nr. 1");
          String innAntall2 = showInputDialog("Antall varer: ");
          String innpris2 = showInputDialog("Pris: ");

          int Antall1,Antall2;
          double pris1, pris2;
          try {
               Antall1 = Integer.parseInt(innAntall1);
               pris1 = Double.parseDouble(innpris1);
          }catch(Exception e){
               Antall1=0;
               pris1=0;
              showMessageDialog(null, "Feil i antall eller pris");
          } try {
              Antall2 = Integer.parseInt(innAntall2);
              pris2 = Double.parseDouble(innpris2);
          }catch(Exception e){
              Antall2=0;
              pris2=0;
              showMessageDialog(null, "Feil i antall eller pris");
          }

          Oppgave2Vare Vare1 = new Oppgave2Vare(Varenavn1,Antall1, pris1);
          Oppgave2Vare Vare2 = new Oppgave2Vare(Varenavn2,Antall2, pris2);

          double sum = Vare1.total()+Vare2.total();
          System.out.println("Totalprisen ble: "+sum+" kr.");


          // les inn navn, antall og pris for vare 1

          // les inn navn, antall og pris for vare 2

          // bruk avvikshåntering (try/catch) for å konvertere
          // antall og pris for vare 1 og vare 2

          // opprett to vare-objekter med de innleste verdiene

          // beregn og skriv ut total pris for alle varer i System.out


      }
}
