package kategorie.validator.service;



import kategorie.model.Kategoria;

import java.util.List;

public interface KategoriaService {
    Kategoria getById(String id);

    List<Kategoria> getAll();
}
