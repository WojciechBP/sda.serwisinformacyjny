package uzytkownik.dao.impl;

import uzytkownik.model.Uzytkownik;

import java.time.LocalDate;
import java.util.List;

public class UserMockDao implements UserDao{
    private List<Uzytkownik> users;


    public UserMockDao() {
        Uzytkownik.builder().idUzytkownik(1).login("adam.kowalski@gmail.com").hasło("kowal123").nazwaKonta("akowalski1966").dataZałożeniaKonta(LocalDate.of(2022,01,12)).województwo("Małopolskie").miasto("Karków").adres("Poznańska 10, 30-063").statusKonta("Aktywne");
        Uzytkownik.builder().idUzytkownik(2).login("a.ciuła@wp.pl").hasło("kucyk971").nazwaKonta("kuberty123").dataZałożeniaKonta(LocalDate.of(2021,03,21)).województwo("Mazowieckie").miasto("Warszawa").adres("Puławska 154/4, 00-022").statusKonta("Nieaktywne");
        Uzytkownik.builder().idUzytkownik(3).login("c.remik@onet.pl").hasło("Starosta21").nazwaKonta("fabia22").dataZałożeniaKonta(LocalDate.of(2021,05,22)).województwo("Kieleckie").miasto("Kielce").adres("Tarnowska 85a, 25-004").statusKonta("Zablokowane");

    }


    @Override
    public Uzytkownik getByID(int idUser) {
        for (Uzytkownik u: users) {
            if (u.getIdUzytkownik() == idUser) {
                return u;
            }
        }
        return null;
    }

    @Override
    public List<Uzytkownik> getAll() {
        return users;
    }
}
