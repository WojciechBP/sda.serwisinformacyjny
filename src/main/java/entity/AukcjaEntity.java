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
@Table(name = "aukcja")
public class AukcjaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idAukcja;
    @Column(name = "idAukcja")
    private String tytuł;
    @Column(name = "tytuł")
    private String opis;
    @Column(name = "opis")
    private KategorieEntity katogoria;
    @Column(name = "kategoria")
    private double kwotaMinimalna;
    @Column(name = "kwotaMinimalna")
    private double kwotaKupTeraz;
    @Column(name = "kwotaKupteraz")
    private String użytkownik;
    @Column(name = "uzytkownik")
    private LocalDate dataWystawienia;
    @Column(name = "dataWystawienia")
    private LocalDate dataZakończenia;
    @Column(name = "datazakończenia")
    private int ilośćOdwiedzin;

}

