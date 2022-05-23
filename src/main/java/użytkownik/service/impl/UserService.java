package użytkownik.service.impl;

import użytkownik.model.User;

import java.util.List;

public interface UserService {

    User getById(String id);

    List<User> getAll();

}
