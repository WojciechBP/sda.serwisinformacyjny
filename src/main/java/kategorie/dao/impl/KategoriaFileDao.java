package kategorie.dao.impl;

import kategorie.model.Kategoria;
import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

public class KategoriaFileDao implements KategoriaDao{

    @Builder
    @Override
    public Kategoria getByID(int idKategoria) {
        return Kategoria.builder().idKategoria(1).kategoria("Elektronika").nazwaOpisowa("Nie wiem co wpisać").build();
    }

    @Override
    public List<Kategoria> getAll() {
        return new ArrayList<>();
    }
}
