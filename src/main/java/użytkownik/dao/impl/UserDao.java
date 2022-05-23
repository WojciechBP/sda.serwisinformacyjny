package użytkownik.dao.impl;

import użytkownik.model.User;

import java.util.List;

public interface UserDao {

    User getByID(int idUser);

    List<User> getAll();
}
