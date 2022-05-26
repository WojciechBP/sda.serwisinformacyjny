package zakup.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Zakup {
    private int idZakup;
    private int idUzytkownika;
    private double Kwota;
}