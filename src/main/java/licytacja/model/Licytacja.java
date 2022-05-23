package licytacja.model;

import lombok.Builder;
import lombok.Data;

    @Data
    @Builder
public class Licytacja {
    private int idLicytacja;
    private int idAukcja;
    private int idUżytkownik;
    private double kwota;
}
