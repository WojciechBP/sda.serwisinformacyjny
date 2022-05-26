package uzytkownik.licytacja.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
public class Licytacja {
    private int idLicytacja;
    private int idAukcja;
    private int idUżytkownik;
    private double kwota;
}
