package licytacja.service.impl;

import licytacja.model.Licytacja;

import java.util.List;

public interface LicytacjaService {

    Licytacja getById(String id);

    List<Licytacja> getAll();
}
