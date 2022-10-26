package DTOs;

public class Aktie {

    private String navn;
    private double pris;
    private String firma;


    public Aktie(){
    }

    public Aktie(String navn, double pris, String firma) {
        this.navn = navn;
        this.pris = pris;
        this.firma = firma;
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
}
