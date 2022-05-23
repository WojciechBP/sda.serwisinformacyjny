package kategorie.dao.impl;

import kategorie.model.Kategoria;

import java.util.List;

public interface KategoriaDao {

    Kategoria getByID(int idKategoria);

    List<Kategoria> getAll();

}
