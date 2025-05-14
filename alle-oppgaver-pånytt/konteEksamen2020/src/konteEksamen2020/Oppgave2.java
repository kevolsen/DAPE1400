package konteEksamen2020;
import static javax.swing.JOptionPane.*;

class konverterTemperatur {
    public static double tilCelsius(double fahrenheit){
        return (fahrenheit-32)/1.8;
    }
    public static double tilFahrenheit(double celsius){
        return (celsius*1.8)+32;
    }
}

public class Oppgave2 {
    public static void main(String[]args){
        String type = showInputDialog("Vil du konvertere fra fahrenheit eller fra celsius?");
        if(type.equals("fahrenheit")) {
            double FtC = Double.parseDouble(showInputDialog("Hvor mange grader er det i fahrenheit?"));
            showMessageDialog(null,konverterTemperatur.tilCelsius(FtC));
        } else if(type.equals("celsius")) {
            double CtF = Double.parseDouble(showInputDialog("Hvor mange grader er det i celsius?"));
            showMessageDialog(null,konverterTemperatur.tilFahrenheit(CtF));
        } else {
            showMessageDialog(null,"Vennligst skriv enten fahrenheit eller celsius");
        }


    }
}
