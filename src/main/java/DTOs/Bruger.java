package DTOs;

public class Bruger {

private String username;
private String password;
private int depotId;
private double saldo;

public Bruger(){
}

    public Bruger(String username, String password, int depotID, double saldo) {
        this.username = username;
        this.password = password;
        this.depotId = depotID;
        this.saldo = saldo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDepotId() {
        return depotId;
    }

    public void setDepotId(int depotId) {
        this.depotId = depotId;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
