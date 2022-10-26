package DTOs;

public class Depot {

    private int id;
    private String aktieNavn;
    private int antal;

    public Depot(){
    }

    public Depot(int id, String aktieNavn, int antal) {
        this.id = id;
        this.aktieNavn = aktieNavn;
        this.antal = antal;
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
}
