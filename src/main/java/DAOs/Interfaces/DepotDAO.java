package DAOs.Interfaces;

import DTOs.Aktie;
import DTOs.Depot;

import java.util.List;

public interface DepotDAO {

    Depot getDepot(int depotID);

    boolean createDepotEntry(int id, String aktieNavn, int antal, double købspris);

    void reset(int depotID);

    void removeDepotEntry(int depotID, String navn, int antal);

    List<Depot> getAll(int depotID);
}
