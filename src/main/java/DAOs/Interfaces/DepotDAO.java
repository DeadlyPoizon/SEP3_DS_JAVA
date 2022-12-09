package DAOs.Interfaces;

import DTOs.Depot;

public interface DepotDAO {

    Depot getDepot(int depotID);

    boolean createDepotEntry(int id, String aktieNavn, int antal, double købspris);
}
