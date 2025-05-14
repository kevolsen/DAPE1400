package oblig1;

public class oblig1oppgave1 {
    public static double diameter(double radius) {
        return radius * 2;
    }

    public static double omkrets(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double areal(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[]args){
        double radius=23.5;
        String diameter,omkrets,areal;
        diameter = String.format("%.2f",diameter(radius));
        omkrets = String.format("%.2f",omkrets(radius));
        areal = String.format("%.2f",areal(radius));
        System.out.println("Arealet av sirkelen med radius "+radius+" er "+areal+"\n"+
                "Omkretsen av sirkelen med radius "+radius+" er "+omkrets+"\n"+
                "Diameteren av sirkelen med radius "+radius+" er "+diameter);
    }

}
