package ocenaTransakcji.dao.impl;


import ocenaTransakcji.model.OcenaTransakcji;

import java.util.List;

public class OcenaTransakcjiMockDao implements OcenaTransakcjiDao {
    private List<OcenaTransakcji> ocenyTransakcji;


    public OcenaTransakcjiMockDao() {

        OcenaTransakcji.builder().idOcenaTransakcji(1).idZakup(1).komentarzSprzedajacego("Dziękuje").ocenaKupujacego(5).komentarzKupujacego("Polecam");
        OcenaTransakcji.builder().idOcenaTransakcji(2).idZakup(2).komentarzSprzedajacego("Dziękuje").ocenaKupujacego(4).komentarzKupujacego("Neutralny");
        OcenaTransakcji.builder().idOcenaTransakcji(3).idZakup(3).komentarzSprzedajacego("Dziękuje").ocenaKupujacego(2).komentarzKupujacego("Nie polecam");
    }


    @Override
    public OcenaTransakcjiDao getByID(int idOcenaTransakcj) {
        for (OcenaTransakcji c: ocenyTransakcji) {
            if (c.getIdOcenaTransakcji() == idOcenaTransakcj) {
                return (OcenaTransakcjiDao) c;
            }
        }
        return null;
    }

    @Override
    public List<OcenaTransakcji> getAll() {
        return ocenyTransakcji;
    }
}