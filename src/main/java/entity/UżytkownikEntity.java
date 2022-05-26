package entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "uzytkownik")
public class UżytkownikEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idUser;
    @Column(name = "idUser")
    private String login;
    @Column(name = "login")
    private String hasło;
    @Column(name = "hasło")
    private String nazwaKonta;
    @Column(name = "nazwaKonta")
    private LocalDate dataZałożeniaKonta;
    @Column(name = "dataZałożenia")
    private String województwo;
    @Column(name = "województwo")
    private String miasto;
    @Column(name = "miasto")
    private String adres;
    @Column(name = "adres")
    private String statusKonta;

}
