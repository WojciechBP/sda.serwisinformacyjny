package zakup.service.impl;

import zakup.dao.impl.ZakupDao;
import zakup.model.Zakup;
import zakup.validator.ZakupValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class ZakupServiceImpl implements ZakupService {

    @Qualifier("ZakupFileDao")
    @Autowired
    private ZakupDao dao;
    private ZakupValidator zakupValidator;

    public Zakup getById(String id) {
        zakupValidator.validateId(id);
        final int parsedID = Integer.parseInt(id);
        return dao.getByID(parsedID);
    }

    @Override
    public List<Zakup> getAll() {
        return dao.getAll();
    }
}
