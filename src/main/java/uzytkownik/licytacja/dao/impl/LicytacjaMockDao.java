package uzytkownik.licytacja.dao.impl;

import uzytkownik.licytacja.model.Licytacja;

import java.util.List;

public class LicytacjaMockDao implements LicytacjaDao {
    private List<Licytacja> licytacje;

    public LicytacjaMockDao() {

        Licytacja.builder().idLicytacja(1).idAukcja(1).idUżytkownik(1).kwota(20);
        Licytacja.builder().idLicytacja(2).idAukcja(2).idUżytkownik(2).kwota(30);
        Licytacja.builder().idLicytacja(3).idAukcja(3).idUżytkownik(3).kwota(40);
    }

    @Override
    public Licytacja getByID(int idLicytacja) {
        for (Licytacja l: licytacje) {
            if(l.getIdLicytacja() == idLicytacja) {
                return l;
            }
        }
        return null;
    }

    @Override
    public List<Licytacja> getAll() {
        return licytacje;
    }
}