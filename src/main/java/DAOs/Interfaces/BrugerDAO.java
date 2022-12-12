package DAOs.Interfaces;

import DTOs.Bruger;

public interface BrugerDAO {

    boolean create(String username, String password, int depotID, double saldo);

    Bruger getUser(String username);

    String getUser(int depotID);

    void buyAktie(double købspris, int depotid);

    void reset(int depotID);

    void sellAktie(double salgspris, int depotid);
}
