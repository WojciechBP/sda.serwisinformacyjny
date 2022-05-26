package uzytkownik.dao.impl;

import lombok.Builder;
import org.springframework.stereotype.Repository;
import uzytkownik.model.Uzytkownik;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
    @Repository
public class UserFileDao implements UserDao {

    @Builder
    @Override
    public Uzytkownik getByID(int idUser) {
        return Uzytkownik.builder().idUzytkownik(1).login("adam.kowalski@gmail.com").hasło("kowal123").nazwaKonta("akowalski1966").dataZałożeniaKonta(LocalDate.of(2022, 01, 12)).województwo("Małopolskie").miasto("Karków").adres("Poznańska 10, 30-063").statusKonta("Aktywne").build();
    }

    @Override
    public List<Uzytkownik> getAll() {
        return new ArrayList<>();
    }
}
