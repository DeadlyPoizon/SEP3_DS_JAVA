package DAOs;

import DAOs.Interfaces.TransaktionDAO;
import DTOs.Transaktion;
import db.DBHelper;
import db.DataMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class TransaktionImpl implements TransaktionDAO {

    private final DBHelper<Transaktion> db;

    private final static String JDBC_URL = "jdbc:postgresql://surus.db.elephantsql.com:5432/wtwmsyke?currentSchema=sydnet";

    private final static String USERNAME = "wtwmsyke";

    private final static String PASSWORD = "rV40CIlTHBJQ2PnZ4NTiILx1gb1M5tp4";

    public TransaktionImpl() {
        this.db = new DBHelper<>(JDBC_URL, USERNAME, PASSWORD);
    }


    private static Transaktion createTransaktionDTO(int transaktionsID, String username, String aktieNavn, int antal, java.sql.Date date){

      Transaktion transaktion = new Transaktion();
      transaktion.setTransaktionsID(transaktionsID);
      transaktion.setUsername(username);
      transaktion.setAktienavn(aktieNavn);
      transaktion.setAntal(antal);
      transaktion.setDate(date);

      return transaktion;
    }
    private static class mapTransaktion implements DataMapper<Transaktion> {
        public Transaktion create(ResultSet rs) throws SQLException {
            int transaktionsID = rs.getInt("transaktionsID");
            String username = rs.getString("username");
            String aktieNavn = rs.getString("aktieNavn");
            int antal = rs.getInt("antal");
            java.sql.Date date = rs.getDate("date");


            return createTransaktionDTO(transaktionsID,username,aktieNavn,antal,date);
        }
    }


    @Override
    public List<Transaktion> getAllTransaktioner() {
        return db.map(new mapTransaktion(),"SELECT * FROM sydnet.transaktion");
    }

    @Override
    public List<Transaktion> getUserTransaktioner(String username) {
        return db.map(new TransaktionImpl.mapTransaktion(), "SELECT * FROM sydnet.transaktion WHERE username = ?", username);
    }

    @Override
    public List<Transaktion> getAktieTransaktioner(String aktie) {
        return db.map(new TransaktionImpl.mapTransaktion(), "SELECT * FROM sydnet.transaktion WHERE aktienavn = ?", aktie);
    }

    @Override
    public List<Transaktion> getDateTransaktioner(Date date) {
        return db.map(new TransaktionImpl.mapTransaktion(), "SELECT * FROM sydnet.transaktion WHERE date = ?", date);
    }

    @Override
    public boolean createTransaktion(int transaktionsID, String username, String aktieNavn, int antal, java.sql.Date date) {
        db.executeUpdate("INSERT INTO sydnet.transaktion VALUES (DEFAULT, ?, ?, ?, ?)", username, aktieNavn, antal, date);
        return true;
    }

    @Override
    public void reset(String username) {
       db.executeUpdate("DELETE FROM sydnet.transaktion WHERE username = ?", username);
    }
}
