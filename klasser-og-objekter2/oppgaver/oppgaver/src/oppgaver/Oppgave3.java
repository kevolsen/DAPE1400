package oppgaver;

class BensinKjøp {
    private String sted;
    private String type;
    private Double antallLiter;
    private Double prisPrLiter;
    private String tidspunkt;

    public BensinKjøp(String sted, String type, Double antallLiter, Double prisPrLiter, String tidspunkt) {
        this.sted = sted;
        this.type = type;
        this.antallLiter = antallLiter;
        this.prisPrLiter = prisPrLiter;
        this.tidspunkt = tidspunkt;
    }

    public String getSted() {
        return sted;
    } public void setSted(String sted) {
        this.sted = sted;
    }
    public String getType() {
        return type;
    } public void setType(String type) {
        this.type = type;
    }
    public double getAntallLiter() {
        return antallLiter;
    } public void setAntallLiter (double antallLiter) {
        this.antallLiter = antallLiter;
    }
    public double getPrisPrLiter() {
        return prisPrLiter;
    } public void setPrisPrLiter(double prisPrLiter) {
        this.prisPrLiter = prisPrLiter;
    }
    public String getTispunkt() {
        return tidspunkt;
    } public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }
    public double finnTotalPrisen() {
        return antallLiter * prisPrLiter;
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
        BensinKjøp etKjøp = new BensinKjøp("Hvam","Diesel",49.00,23.99,"14:00");
        double pris = etKjøp.finnTotalPrisen();
        String nyPris = String.format("%.2f",pris);
        String ut = "Sted: "+etKjøp.getSted()+"\nTidspunkt: "+etKjøp.getTispunkt()+"\nDrivstoff: "+etKjøp.getType()+"\nAntall liter fylt: "+etKjøp.getAntallLiter()+
                "\nPris pr. liter: "+etKjøp.getPrisPrLiter()+"\nTotalpris: "+etKjøp.finnTotalPrisen();
        System.out.println(ut);
    }
}
