package DAOs;

import DAOs.Interfaces.AktieDAO;
import DTOs.Aktie;
import DTOs.Bruger;
import db.DBHelper;
import db.DataMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AktieImpl implements AktieDAO {

    private final DBHelper<Aktie> db;

    private final static String JDBC_URL = "jdbc:postgresql://surus.db.elephantsql.com:5432/wtwmsyke?currentSchema=sydnet";

    private final static String USERNAME = "wtwmsyke";

    private final static String PASSWORD = "rV40CIlTHBJQ2PnZ4NTiILx1gb1M5tp4";

    public AktieImpl() {
        this.db = new DBHelper<>(JDBC_URL, USERNAME, PASSWORD);
    }


    private static Aktie createAktieDTO(String navn, double pris, String firma){

        Aktie aktie = new Aktie();
        aktie.setNavn(navn);
        aktie.setPris(pris);
        aktie.setFirma(firma);

        return aktie;
    }
    private static class mapAktie implements DataMapper<Aktie> {
        public Aktie create(ResultSet rs) throws SQLException {
            String navn = rs.getString("navn");
            double pris = rs.getDouble("pris");
            String firma = rs.getString("firma");


            return createAktieDTO(navn,pris,firma);
        }
    }


    @Override
    public Aktie getAktie(String navn) {
        return db.mapSingle(new AktieImpl.mapAktie(), "SELECT * FROM sydnet.aktie WHERE navn = ?", navn);
    }
}
