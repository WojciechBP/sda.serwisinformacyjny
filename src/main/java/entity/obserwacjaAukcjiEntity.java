package entity;

import javax.persistence.*;

@Entity
@Table
public class obserwacjaAukcjiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idObserwacjiAukcji;
    @Column(name = "idObserwacjaAukcji")
    private int idAukcji;
    @Column(name = "idAukcji")
    private int idUżytkownika;
    @Column(name = "idKategoria")

    public int getIdObserwacjiAukcji() {
        return idObserwacjiAukcji;
    }

    public void setIdObserwacjiAukcji(int idObserwacjiAukcji) {
        this.idObserwacjiAukcji = idObserwacjiAukcji;
    }

    public int getIdAukcji() {
        return idAukcji;
    }

    public void setIdAukcji(int idAukcji) {
        this.idAukcji = idAukcji;
    }

    public int getIdUżytkownika() {
        return idUżytkownika;
    }

    public void setIdUżytkownika(int idUżytkownika) {
        this.idUżytkownika = idUżytkownika;
    }

    @Override
    public String toString() {
        return "obserwacjaAukcjiEntity{" +
                "idObserwacjiAukcji=" + idObserwacjiAukcji +
                ", idAukcji=" + idAukcji +
                ", idUżytkownika=" + idUżytkownika +
                '}';
    }
}
