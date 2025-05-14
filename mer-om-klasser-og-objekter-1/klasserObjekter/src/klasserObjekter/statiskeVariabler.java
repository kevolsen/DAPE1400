package klasserObjekter;

class Bil{
    public String type;
    public static final int antallHjul = 4;
}

public class statiskeVariabler {
    public static void main(String[]args) {
        Bil enBil = new Bil();
        enBil.type = "volvo";
        //enBil.antallHjul = 4;

        System.out.println(enBil.type+" har antall hjul: "+Bil.antallHjul);

        Bil enAnnenBil = new Bil();
        enAnnenBil.type = "Audi";

        //Bil.antallHjul = 3;
        System.out.println(enAnnenBil.type+" har antall hjul: "+Bil.antallHjul);
    }
}
