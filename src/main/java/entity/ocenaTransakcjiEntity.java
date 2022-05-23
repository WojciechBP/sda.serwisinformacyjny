package entity;

import javax.persistence.*;

@Entity
@Table
public class ocenaTransakcjiEntity {
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
    @Column(name = "komentarzKupującego")

    public int getIdOcenaTransakcji() {
        return idOcenaTransakcji;
    }

    public void setIdOcenaTransakcji(int idOcenaTransakcji) {
        this.idOcenaTransakcji = idOcenaTransakcji;
    }

    public int getIdZakup() {
        return idZakup;
    }

    public void setIdZakup(int idZakup) {
        this.idZakup = idZakup;
    }

    public String getKomentarzSprzedającego() {
        return komentarzSprzedającego;
    }

    public void setKomentarzSprzedającego(String komentarzSprzedającego) {
        komentarzSprzedającego = komentarzSprzedającego;
    }

    public int getOcenaKupującego() {
        return ocenaKupującego;
    }

    public void setOcenaKupującego(int ocenaKupującego) {
        ocenaKupującego = ocenaKupującego;
    }

    public String getKomentarzKupującego() {
        return komentarzKupującego;
    }

    public void setKomentarzKupującego(String komentarzKupującego) {
        komentarzKupującego = komentarzKupującego;
    }

    @Override
    public String toString() {
        return "ocenaTransakcjiEntity{" +
                "idOcenaTransakcji=" + idOcenaTransakcji +
                ", idZakup=" + idZakup +
                ", KomentarzSprzedającego='" + komentarzSprzedającego + '\'' +
                ", OcenaKupującego=" + ocenaKupującego +
                ", KomentarzKupującego='" + komentarzKupującego + '\'' +
                '}';
    }
}
