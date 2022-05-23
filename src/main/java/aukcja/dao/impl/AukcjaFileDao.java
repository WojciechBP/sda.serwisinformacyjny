package aukcja.dao.impl;

import aukcja.model.Aukcja;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

public class AukcjaFileDao implements AukcjaDao {


    @Override
    @Builder
    public Aukcja getByID(int idAukcja) {
        return Aukcja.builder().idAukcja(1).tytuł("Smartfon Apple iPhone 5s").opis("Witam, sprzedam telefon iPhone 5S 16 Gb, używany prywatnie, stan bardzo dobry, bez uszkodzeń, w zestawie ładowarka i słuchawki, pudełko. Zapraszam do licytacji").kategoria("Elekronika").kwotaMinimalna(180).kwotaMinimalna(250).dataWystawienia(LocalDate.of(2022,03,05)).dataZakończenia(LocalDate.of(2022,05,15)).ilośćOdwiedzin(5).build();
    }

    @Override
    public List<Aukcja> getAll() {
        return null;
    }
}
