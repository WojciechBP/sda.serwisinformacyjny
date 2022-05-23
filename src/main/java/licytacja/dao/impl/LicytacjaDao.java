package licytacja.dao.impl;

import licytacja.model.Licytacja;

import java.util.List;

public interface LicytacjaDao {
    Licytacja getByID(int idLicytacja);

    List<Licytacja> getAll();
}
