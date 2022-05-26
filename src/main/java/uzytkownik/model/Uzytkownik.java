package uzytkownik.model;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Uzytkownik {

    private int idUzytkownik;
    private String login;
    private String hasło;
    private String nazwaKonta;
    private LocalDate dataZałożeniaKonta;
    private String województwo;
    private String miasto;
    private String adres;
    private String statusKonta;




}
