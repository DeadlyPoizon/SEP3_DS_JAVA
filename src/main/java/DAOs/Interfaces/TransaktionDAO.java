package DAOs.Interfaces;

import DTOs.Transaktion;

import java.util.Date;
import java.util.List;

public interface TransaktionDAO {

List<Transaktion> getAllTransaktioner ();

List<Transaktion> getUserTransaktioner(String username);

List<Transaktion> getAktieTransaktioner(String aktie);

List<Transaktion> getDateTransaktioner(Date date);
}
