package DTOs;

import java.sql.Date;

public class Transaktion {

    private int transaktionsID;
    private String username;
    private String aktienavn;
    private int antal;
    private Date date;


    public Transaktion() {
    }

    public Transaktion(int transaktionsID, String username, String aktienavn, int antal, Date date) {
        this.transaktionsID = transaktionsID;
        this.username = username;
        this.aktienavn = aktienavn;
        this.antal = antal;
        this.date = date;
    }

    public int getTransaktionsID() {
        return transaktionsID;
    }

    public void setTransaktionsID(int transaktionsID) {
        this.transaktionsID = transaktionsID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAktienavn() {
        return aktienavn;
    }

    public void setAktienavn(String aktienavn) {
        this.aktienavn = aktienavn;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
