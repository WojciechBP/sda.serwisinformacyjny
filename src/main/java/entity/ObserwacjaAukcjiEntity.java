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
@Table(name = "obserwacja_aukcji")
public class ObserwacjaAukcjiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idObserwacjiAukcji;
    @Column(name = "idObserwacjaAukcji")
    private int idAukcji;
    @Column(name = "idAukcji")
    private int idUżytkownika;

}
