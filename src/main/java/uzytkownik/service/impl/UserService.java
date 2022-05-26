package uzytkownik.service.impl;

import uzytkownik.model.Uzytkownik;

import java.util.List;

public interface UserService {

    Uzytkownik getById(String id);

    List<Uzytkownik> getAll();

}
