package uzytkownik.licytacja.dao.impl;

import uzytkownik.licytacja.model.Licytacja;
import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

public class LicytacjaFileDao implements LicytacjaDao {
    @Builder
    @Override
    public Licytacja getByID(int idLicytacja) {
        return Licytacja.builder().idLicytacja(1).idAukcja(1).idUżytkownik(1).kwota(20).build();
    }

    @Override
    public List<Licytacja> getAll() {

        return  new ArrayList<>();
    }
}
