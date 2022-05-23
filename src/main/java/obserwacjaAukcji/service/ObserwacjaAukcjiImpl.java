package obserwacjaAukcji.service;

import obserwacjaAukcji.dao.impl.ObserwacjaAukcjiDao;
import obserwacjaAukcji.model.ObserwacjaAukcji;
import obserwacjaAukcji.validator.ObserwacjaAukcjiValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class ObserwacjaAukcjiImpl implements ObserwacjaAukcjiService{
    @Qualifier("ObserwacjaAukcjiFileDao")
    @Autowired
    private ObserwacjaAukcjiDao dao;
    private ObserwacjaAukcjiValidator obserwacjaAukcjiValidatorValidator;

    @Override
    public ObserwacjaAukcji getById(String id) {
        obserwacjaAukcjiValidatorValidator.validateId(id);
        final int parsedID = Integer.parseInt(id);
        return dao.getByID(parsedID);
    }

    @Override
    public List<ObserwacjaAukcji> getAll() {
        return dao.getAll();
    }
}
