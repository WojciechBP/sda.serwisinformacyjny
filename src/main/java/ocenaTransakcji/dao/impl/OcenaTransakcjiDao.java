package ocenaTransakcji.dao.impl;

import ocenaTransakcji.model.OcenaTransakcji;

import java.util.List;

public interface OcenaTransakcjiDao {

    OcenaTransakcjiDao getByID(int idOcenaTransakcj);

    List<OcenaTransakcji> getAll();
}
