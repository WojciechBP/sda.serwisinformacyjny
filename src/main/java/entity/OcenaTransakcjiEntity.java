package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name ="ocena_transakcji")
public class OcenaTransakcjiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idOcenaTransakcji;
    @Column(name = "odOcenaTransakcji")
    private int idZakup;
    @Column(name = "idZakup")
    private String komentarzSprzedającego;
    @Column(name = "komentarzSprzedającego")
    private int ocenaKupującego;
    @Column(name = "ocenaKupującego")
    private String komentarzKupującego;

}
