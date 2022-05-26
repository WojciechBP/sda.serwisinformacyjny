package uzytkownik.licytacja.service.impl;

import uzytkownik.licytacja.dao.impl.LicytacjaDao;
import uzytkownik.licytacja.model.Licytacja;

import uzytkownik.licytacja.validator.LicytacjaValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class LicytacjaServiceImpl implements LicytacjaService{

    @Qualifier("LicytacjaFileDao")
    @Autowired
    private LicytacjaDao dao;
    private LicytacjaValidator licytacjaValidator;

    @Override
    public Licytacja getById(String id) {
        LicytacjaValidator.validateId(id);
        final int parsedID = Integer.parseInt(id);
        return dao.getByID(parsedID);
    }

    @Override
    public List<Licytacja> getAll() {

        return dao.getAll();
    }
}
