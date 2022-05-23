package ocenaTransakcji.dao.impl;

import ocenaTransakcji.model.OcenaTransakcji;
import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

public class OcenaTransakcjiFileDao implements OcenaTransakcjiDao{

    @Builder
    @Override
    public OcenaTransakcjiDao getByID(int idOcenaTransakcj) {
        return (OcenaTransakcjiDao) OcenaTransakcji.builder().idOcenaTransakcji(1).idZakup(1).komentarzSprzedającego("Dziękuje za " +
                "polecenie").ocenaKupującego(5).komentarzKupującego("Transakcja przebiegła prawidłowo.Polecam").build();
    }

    @Override
    public List<OcenaTransakcji> getAll() {
        return new ArrayList<>();
    }
}