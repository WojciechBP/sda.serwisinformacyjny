package ocenaTransakcji.service.impl;

import ocenaTransakcji.dao.impl.OcenaTransakcjiDao;
import ocenaTransakcji.model.OcenaTransakcji;
import ocenaTransakcji.validator.OcenaTransakcjiValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class OcenaTransakcjiServiceImpl implements OcenaTransakcjiService{

    @Qualifier("OcenaTransakcjiFileDao")
    @Autowired
    private OcenaTransakcjiDao dao;
    private OcenaTransakcjiValidator ocenaTransakcjiValidator;

    @Override
    public OcenaTransakcji getById(String id) {
        ocenaTransakcjiValidator.validateId(id);
        final int parsedID = Integer.parseInt(id);
        return (OcenaTransakcji) dao.getByID(parsedID);
    }

    @Override
    public List<OcenaTransakcji> getAll() {
        return dao.getAll();
    }
}
