package użytkownik.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class User {

    private int idUser;
    private String login;
    private String hasło;
    private String nazwaKonta;
    private LocalDate dataZałożeniaKonta;
    private String województwo;
    private String miasto;
    private String adres;
    private String statusKonta;

}
