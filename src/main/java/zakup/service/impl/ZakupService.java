package zakup.service.impl;

import zakup.model.Zakup;
import java.util.List;

public interface ZakupService {

    Zakup getById(String id);

    List<Zakup> getAll();
}
