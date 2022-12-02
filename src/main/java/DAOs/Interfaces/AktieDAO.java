package DAOs.Interfaces;

import DTOs.Aktie;
import DTOs.Bruger;

public interface AktieDAO {

    Aktie getAktie (String navn);

    boolean createAktie(String navn, double pris, String firma, double high, double low);

    boolean updateAktie(String navn, double pris, double high, double low);
}
