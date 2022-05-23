package aukcja.service.impl;

import aukcja.dao.impl.AukcjaDao;
import aukcja.model.Aukcja;
import aukcja.validator.AukcjaValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class AukcjaServiceImpl implements AukcjaService {
    @Qualifier("aukcjaFileDao")
    @Autowired
    private AukcjaDao dao;
    private AukcjaValidator aukcjaValidator;


    @Override
    public Aukcja getByID(String id) {
        aukcjaValidator.validateId(id);
        final int parsedID = Integer.parseInt(id);
        return dao.getByID(parsedID);
    }

    @Override
    public List<Aukcja> getAll() {
        return dao.getAll();
    }
}
