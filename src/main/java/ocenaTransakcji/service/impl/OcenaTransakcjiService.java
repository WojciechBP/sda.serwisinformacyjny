package ocenaTransakcji.service.impl;

import ocenaTransakcji.model.OcenaTransakcji;

import java.util.List;

public interface OcenaTransakcjiService {
    OcenaTransakcji getById(String id);

    List<OcenaTransakcji> getAll();
}
