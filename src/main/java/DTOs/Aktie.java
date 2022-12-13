package DTOs;

public class Aktie {

    private String navn;
    private double pris;
    private String firma;

    private double high;

    private double low;


    public Aktie() {
    }

    public Aktie(String navn, double pris, String firma, double high, double low) {
        this.navn = navn;
        this.pris = pris;
        this.firma = firma;
        this.high = high;
        this.low = low;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }
}
