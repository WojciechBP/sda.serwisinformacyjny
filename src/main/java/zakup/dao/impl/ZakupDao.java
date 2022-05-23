package zakup.dao.impl;

import zakup.model.Zakup;
import java.util.List;

public interface ZakupDao {

    Zakup getByID(int idZakup);

    List<Zakup> getAll();
}
