package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "uzytkownik_licytacja")
public class LicytacjaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLicytacja;
    @Column(name = "idlicytacja")
    private int idAukcja;
    @Column(name = "idAukcja")
    private int idUżytkownik;
    @Column(name = "idUżytkownik")
    private double kwota;


}
