package aukcja.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Aukcja {
    private int idAukcja;
    private String tytuł;
    private String opis;
    private String kategoria;
    private double kwotaMinimalna;
    private double kwotaKupTeraz;
    private String użytkownik;
    private LocalDate dataWystawienia;
    private LocalDate dataZakończenia;
    private int ilośćOdwiedzin;

}
