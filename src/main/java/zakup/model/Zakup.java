package zakup.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Zakup {
    private int idZakup;
    private int idUżytkownika;
    private double Kwota;
}