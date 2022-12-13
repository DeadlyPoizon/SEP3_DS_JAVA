package DAOs;

import DAOs.Interfaces.DepotDAO;
import DTOs.Aktie;
import DTOs.Depot;
import db.DBHelper;
import db.DataMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DepotImpl implements DepotDAO {

    private final DBHelper<Depot> db;

    private final static String JDBC_URL = "jdbc:postgresql://surus.db.elephantsql.com:5432/wtwmsyke?currentSchema=sydnet";

    private final static String USERNAME = "wtwmsyke";

    private final static String PASSWORD = "rV40CIlTHBJQ2PnZ4NTiILx1gb1M5tp4";

    public DepotImpl() {
        this.db = new DBHelper<>(JDBC_URL, USERNAME, PASSWORD);
    }


    private static Depot createDepotDTO(int depotID, String aktieNavn, int antal, double købspris) {

        Depot depot = new Depot();
        depot.setId(depotID);
        depot.setAktieNavn(aktieNavn);
        depot.setAntal(antal);
        depot.setKøbspris(købspris);
        return depot;
    }

    private static class mapDepot implements DataMapper<Depot> {
        public Depot create(ResultSet rs) throws SQLException {
            int id = rs.getInt("id");
            String aktieNavn = rs.getString("aktieNavn");
            int antal = rs.getInt("antal");
            double købspris = rs.getDouble("købspris");


            return createDepotDTO(id, aktieNavn, antal, købspris);
        }
    }


    @Override
    public Depot getDepot(int depotID) {
        return db.mapSingle(new mapDepot(), "SELECT * FROM sydnet.depot WHERE ID = ?", depotID);
    }

    @Override
    public boolean createDepotEntry(int id, String aktieNavn, int antal, double købspris) {
        db.executeUpdate("INSERT INTO sydnet.depot VALUES (?, ?, ?, ?)", id, aktieNavn, antal, købspris);
        return true;
    }

    @Override
    public void reset(int depotID) {
        db.executeUpdate("DELETE FROM sydnet.depot WHERE id = ?", depotID);
    }

    @Override
    public void removeDepotEntry(int depotID, String navn, int antal) {
        Depot depot = db.mapSingle(new mapDepot(), "SELECT * FROM sydnet.depot WHERE id = ? AND aktienavn = ?", depotID, navn);
        if (antal == depot.getAntal()) {
            System.out.println("delet");
            db.executeUpdate("DELETE FROM sydnet.depot WHERE id = ? AND aktienavn = ?", depotID, navn);
        } else if (antal < depot.getAntal()) {
            System.out.println("sell");
            db.executeUpdate("UPDATE sydnet.depot SET antal = ? WHERE id = ? AND aktienavn = ?", antal, depotID, navn);
        }
    }

    @Override
    public List<Depot> getAll(int depotID) {
        return db.map(new DepotImpl.mapDepot(), "SELECT * FROM sydnet.depot WHERE id = ?", depotID);
    }
}
