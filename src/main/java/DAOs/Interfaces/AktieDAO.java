package DAOs.Interfaces;

import DTOs.Aktie;
import DTOs.Bruger;

public interface AktieDAO {

    Aktie getAktie (String navn);
}
