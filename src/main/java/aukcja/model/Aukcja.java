package aukcja.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Aukcja {
    private int idAukcja;
    private String tytul;
    private String opis;
    private String kategoria;
    private double kwotaMinimalna;
    private double kwotaKupTeraz;
    private String uzytkownik;
    private LocalDate dataWystawienia;
    private LocalDate dataZakonczenia;
    private int iloscOdwiedzin;

}
