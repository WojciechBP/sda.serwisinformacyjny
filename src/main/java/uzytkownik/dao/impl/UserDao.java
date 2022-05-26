package uzytkownik.dao.impl;

import uzytkownik.model.Uzytkownik;

import java.util.List;

public interface UserDao {

    Uzytkownik getByID(int idUser);

    List<Uzytkownik> getAll();
}
