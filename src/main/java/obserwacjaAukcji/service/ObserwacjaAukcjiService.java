package obserwacjaAukcji.service;

import obserwacjaAukcji.model.ObserwacjaAukcji;

import java.util.List;

public interface ObserwacjaAukcjiService {

    ObserwacjaAukcji getById(String id);

    List<ObserwacjaAukcji> getAll();
}