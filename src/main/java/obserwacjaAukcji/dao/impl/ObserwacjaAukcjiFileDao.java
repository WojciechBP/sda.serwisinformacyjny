package obserwacjaAukcji.dao.impl;

import obserwacjaAukcji.model.ObserwacjaAukcji;
import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

public class ObserwacjaAukcjiFileDao implements ObserwacjaAukcjiDao {

    @Builder
    @Override

    public ObserwacjaAukcji getByID(int idObserwacjiAukcji) {
        return ObserwacjaAukcji.builder().idObserwacjiAukcji(1).idAukcji(1).idUżytkownika(1).build();
    }

    @Override
    public List<ObserwacjaAukcji> getAll() {
        return new ArrayList<>();
    }
}
