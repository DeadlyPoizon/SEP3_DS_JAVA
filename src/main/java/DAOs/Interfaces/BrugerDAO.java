package DAOs.Interfaces;

import DTOs.Bruger;

public interface BrugerDAO {

    boolean create(String username, String password, int depotID, double saldo);

    Bruger getUser(String username);
}
