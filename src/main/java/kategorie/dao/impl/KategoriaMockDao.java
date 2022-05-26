package kategorie.dao.impl;

import kategorie.model.Kategoria;

import java.util.List;

public class KategoriaMockDao implements KategoriaDao {
    private List<Kategoria> kategorie;

    public void Kategoria() {
        Kategoria.builder().idKategoria(1).nazwa("Elektronika").nazwaOpisowa("nie wiem co wpisać");

    }


    @Override
    public Kategoria getByID(int idKategoria) {
        for (Kategoria k: kategorie) {
            if (k.getIdKategoria() == idKategoria) {
                return k;
            }
        }
        return null;
    }

    @Override
    public List<Kategoria> getAll() {
        return kategorie;
    }
}
