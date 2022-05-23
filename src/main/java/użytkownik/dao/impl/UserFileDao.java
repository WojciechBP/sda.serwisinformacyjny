package użytkownik.dao.impl;

import użytkownik.model.User;
import lombok.Builder;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserFileDao implements UserDao {

    @Builder
    @Override
    public User getByID(int idUser) {
        return User.builder().idUser(1).login("adam.kowalski@gmail.com").hasło("kowal123").nazwaKonta("akowalski1966").dataZałożeniaKonta(LocalDate.of(2022, 01, 12)).województwo("Małopolskie").miasto("Karków").adres("Poznańska 10, 30-063").statusKonta("Aktywne").build();
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>();
    }
}
