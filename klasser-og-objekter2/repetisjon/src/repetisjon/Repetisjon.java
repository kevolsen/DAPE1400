package repetisjon;

class Bil {
    public int tank;
    public double rekkevidde(double forbruk) {
        double rekkevidde = tank/forbruk;
        return rekkevidde;
    }
}

public class Repetisjon {
    public static void main(String[] args) {
        Bil volvo = new Bil(); // Volvo er et nytt objekt eller variabel av type Bil (klassen). Volvo er et objekt av type bil.
        volvo.tank = 80;
        double literPerMil = 0.8; // Ny variabel
        double rekkevidde = volvo.rekkevidde(literPerMil); // blir 80/0.8, literPerMil=forbruk ^
        System.out.println("Rekkevidden til bilen er "+rekkevidde+" mil.");
    }
}