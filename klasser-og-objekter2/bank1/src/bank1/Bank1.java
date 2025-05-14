package bank1;

public class Bank1 {

    public static void main(String[] args) {
        Konto sparekonto = new Konto("12345678901", "Per hansen", 1000);
        Konto lonnskonto = new Konto("12345678901", "Per hansen", 0);
        sparekonto.setSaldo(2000);
        lonnskonto.setSaldo(1000);
        System.out.println("Sparekontoen tilhører "+sparekonto.getNavn());
        System.out.println("Saldoen til denne nå er "+sparekonto.getSaldo());
        System.out.println("Saldoen til lønnskontoen er "+lonnskonto.getSaldo());
    }
}