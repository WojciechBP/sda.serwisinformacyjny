package obserwacjaAukcji.dao.impl;

import obserwacjaAukcji.model.ObserwacjaAukcji;

import java.util.List;

public interface ObserwacjaAukcjiDao {

    ObserwacjaAukcji getByID(int idObserwacjiAukcji);

    List<ObserwacjaAukcji> getAll();
}
