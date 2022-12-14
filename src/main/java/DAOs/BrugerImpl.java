package DAOs;

import DAOs.Interfaces.BrugerDAO;
import DTOs.Bruger;
import db.DBHelper;
import db.DataMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BrugerImpl implements BrugerDAO {

    private final static String JDBC_URL = "jdbc:postgresql://surus.db.elephantsql.com:5432/wtwmsyke?currentSchema=sydnet";
    private final static String USERNAME = "wtwmsyke";
    private final static String PASSWORD = "rV40CIlTHBJQ2PnZ4NTiILx1gb1M5tp4";
    private final DBHelper<Bruger> db;

    public BrugerImpl() {
        this.db = new DBHelper<>(JDBC_URL, USERNAME, PASSWORD);
    }

    private static Bruger createBrugerDTO(String username, String password, int depotID, double saldo) {

        Bruger bruger = new Bruger();
        bruger.setUsername(username);
        bruger.setPassword(password);
        bruger.setDepotId(depotID);
        bruger.setSaldo(saldo);

        return bruger;
    }

    @Override
    public boolean create(String username, String password, int depotID, double saldo) {
        db.executeUpdate("INSERT INTO sydnet.bruger VALUES (?, ?, DEFAULT, ?)", username, password, saldo);
        return true;
    }

    @Override
    public Bruger getUser(String username) {
        return db.mapSingle(new mapBruger(), "SELECT * FROM sydnet.bruger WHERE username = ?", username);
    }

    @Override
    public String getUser(int depotID) {
        Bruger temp = db.mapSingle(new mapBruger(), "SELECT * FROM sydnet.bruger WHERE depotid = ?", depotID);
        return temp.getUsername();
    }

    @Override
    public void buyAktie(double købspris, int depotid) {
        Bruger temp = db.mapSingle(new mapBruger(), "SELECT * FROM sydnet.bruger WHERE depotid = ?", depotid);
        double tempdouble = temp.getSaldo() - købspris;
        db.executeUpdate("UPDATE sydnet.bruger set saldo = ? WHERE depotid = ?", tempdouble, depotid);

    }

    @Override
    public void reset(int depotID) {
        db.executeUpdate("UPDATE sydnet.bruger set saldo = 100000 WHERE depotid = ?", depotID);
    }

    @Override
    public void sellAktie(double salgspris, int depotid) {
        Bruger temp = db.mapSingle(new mapBruger(), "SELECT * FROM sydnet.bruger WHERE depotid = ?", depotid);
        double tempdouble = temp.getSaldo() + salgspris;
        db.executeUpdate("UPDATE sydnet.bruger set saldo = ? WHERE depotid = ?", tempdouble, depotid);
    }

    private static class mapBruger implements DataMapper<Bruger> {
        public Bruger create(ResultSet rs) throws SQLException {
            String username = rs.getString("username");
            String password = rs.getString("password");
            int depotID = rs.getInt("depotID");
            double saldo = rs.getDouble("saldo");

            return createBrugerDTO(username, password, depotID, saldo);
        }
    }
}
