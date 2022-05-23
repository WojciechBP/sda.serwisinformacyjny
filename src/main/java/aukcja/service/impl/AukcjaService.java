package aukcja.service.impl;

import aukcja.model.Aukcja;

import java.util.List;

public interface AukcjaService {

    Aukcja getByID(String id);

    List<Aukcja> getAll();
}
