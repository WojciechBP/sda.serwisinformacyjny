package zakup.dao.impl;

import zakup.model.Zakup;
import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

public class ZakupFileDao implements ZakupDao{

    @Builder
    @Override
    public Zakup getByID(int idZakup) {
        return Zakup.builder().idZakup(1).idUzytkownika(1).Kwota(20).build();
    }

    @Override
    public List<Zakup> getAll() {
        return new ArrayList<>();
    }
}