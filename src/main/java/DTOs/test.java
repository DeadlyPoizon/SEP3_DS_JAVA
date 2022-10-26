package DTOs;

import java.sql.Date;

public class test {

    public static void main(String[] args) {
        Aktie aktie = new Aktie("fff",22,"ost");
        Depot depot = new Depot(1,aktie.getNavn(),2);
        Bruger bruger = new Bruger("flemming","123",depot.getId(),22);
        Transaktion transaktion = new Transaktion(1, bruger.getUsername(), aktie.getNavn(), 1,new Date(2022,12,12));
    }
}
