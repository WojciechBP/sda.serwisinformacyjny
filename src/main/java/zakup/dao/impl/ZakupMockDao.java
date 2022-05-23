package zakup.dao.impl;

import zakup.model.Zakup;

import java.util.List;

public class ZakupMockDao implements ZakupDao{
    private List<Zakup> zakupy;

    public ZakupMockDao() {

        Zakup.builder().idZakup(1).idUżytkownika(1).Kwota(20);
        Zakup.builder().idZakup(2).idUżytkownika(2).Kwota(30);
        Zakup.builder().idZakup(3).idUżytkownika(3).Kwota(40);
    }
    @Override
    public Zakup getByID(int idZakup) {
        for (Zakup z: zakupy) {
            if (z.getIdZakup() == idZakup) {
                return z;
            }
        }
        return null;
    }

    @Override
    public List<Zakup> getAll() {
        return zakupy;
    }
}
