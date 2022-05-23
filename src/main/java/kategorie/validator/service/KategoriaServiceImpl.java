package kategorie.validator.service;



import kategorie.dao.impl.KategoriaDao;
import kategorie.model.Kategoria;
import kategorie.validator.KategoriaValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class KategoriaServiceImpl implements KategoriaService{
    @Qualifier("KategoriaFileDao")
    @Autowired
    private KategoriaDao dao;
    private KategoriaValidator kategoriaValidator;
    @Override
    public Kategoria getById(String id) {
        kategoriaValidator.validateId(id);
        final int parsedID = Integer.parseInt(id);
        return dao.getByID(parsedID);
    }

    @Override
    public List<Kategoria> getAll() {
        return dao.getAll();
    }
}
