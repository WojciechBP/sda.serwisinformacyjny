package użytkownik.service.impl;

import użytkownik.dao.impl.UserDao;
import użytkownik.model.User;
import użytkownik.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Qualifier("userFileDao")
    @Autowired
    private UserDao dao;
    private UserValidator userValidator;

    @Override
    public User getById(String id) {
        userValidator.validateId(id);
        final int parsedID = Integer.parseInt(id);
        return dao.getByID(parsedID);
    }

    @Override
    public List<User> getAll() {

        return dao.getAll();
    }

    
}
