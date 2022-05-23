package ocenaTransakcji.dao.impl;


import ocenaTransakcji.model.OcenaTransakcji;

import java.util.List;

public class OcenaTransakcjiMockDao implements OcenaTransakcjiDao {
    private List<OcenaTransakcji> ocenyTransakcji;


    public OcenaTransakcjiMockDao() {

        OcenaTransakcji.builder().idOcenaTransakcji(1).idZakup(1).komentarzSprzedającego("Dziękuje").ocenaKupującego(5).komentarzKupującego("Polecam");
        OcenaTransakcji.builder().idOcenaTransakcji(2).idZakup(2).komentarzSprzedającego("Dziękuje").ocenaKupującego(4).komentarzKupującego("Neutralny");
        OcenaTransakcji.builder().idOcenaTransakcji(3).idZakup(3).komentarzSprzedającego("Dziękuje").ocenaKupującego(2).komentarzKupującego("Nie polecam");
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