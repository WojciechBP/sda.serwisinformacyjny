package uzytkownik.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import uzytkownik.dao.impl.UserDao;
import uzytkownik.model.Uzytkownik;
import uzytkownik.validator.UserValidator;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Qualifier("userFileDao")
    @Autowired

    private UserDao dao;
    private UserValidator userValidator;

    @Override
    public Uzytkownik getById(String id) {
        userValidator.validateId(id);
        final int parsedID = Integer.parseInt(id);
        return dao.getByID(parsedID);
    }

    @Override
    public List<Uzytkownik> getAll() {

        return dao.getAll();
    }


}
