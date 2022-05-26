package uzytkownik.licytacja.dao.impl;

import uzytkownik.licytacja.model.Licytacja;

import java.util.List;

public interface LicytacjaDao {
    Licytacja getByID(int idLicytacja);

    List<Licytacja> getAll();
}
