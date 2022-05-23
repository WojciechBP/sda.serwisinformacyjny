package aukcja.dao.impl;


import aukcja.model.Aukcja;

import java.util.List;

public interface AukcjaDao {
    Aukcja getByID(int idAukcja);

    List<Aukcja> getAll();
}
