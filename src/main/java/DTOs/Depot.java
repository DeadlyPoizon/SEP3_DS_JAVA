package DTOs;

public class Depot {

    private int id;
    private String aktieNavn;
    private int antal;
    private double købspris;

    public Depot() {
    }

    public Depot(int id, String aktieNavn, int antal, double købspris) {
        this.id = id;
        this.aktieNavn = aktieNavn;
        this.antal = antal;
        this.købspris = købspris;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAktieNavn() {
        return aktieNavn;
    }

    public void setAktieNavn(String aktieNavn) {
        this.aktieNavn = aktieNavn;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public double getKøbspris() {
        return købspris;
    }

    public void setKøbspris(double købspris) {
        this.købspris = købspris;
    }
}
