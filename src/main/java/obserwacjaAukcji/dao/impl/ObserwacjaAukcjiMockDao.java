package obserwacjaAukcji.dao.impl;

import obserwacjaAukcji.model.ObserwacjaAukcji;


import java.util.List;

public class ObserwacjaAukcjiMockDao implements ObserwacjaAukcjiDao{
    private List<ObserwacjaAukcji> obserwacjeAukcji;

    public ObserwacjaAukcjiMockDao() {

        ObserwacjaAukcji.builder().idObserwacjiAukcji(1).idAukcji(1).idUżytkownika(1);
        ObserwacjaAukcji.builder().idObserwacjiAukcji(2).idAukcji(2).idUżytkownika(2);
        ObserwacjaAukcji.builder().idObserwacjiAukcji(3).idAukcji(3).idUżytkownika(3);
    }

    @Override
    public ObserwacjaAukcji getByID(int idObserwacjiAukcji) {
        for (ObserwacjaAukcji o: obserwacjeAukcji) {
            if (o.getIdObserwacjiAukcji() == idObserwacjiAukcji) {
                return o;
            }
        }
        return null;
    }

    @Override
    public List<ObserwacjaAukcji> getAll() {
        return obserwacjeAukcji;
    }
}