package entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "aukcja")
public class aukcjaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idAukcja;
    @Column(name = "idAukcja")
    private String tytuł;
    @Column(name = "tytuł")
    private String opis;
    @Column(name = "opis")
    private String kategoria;
    @Column(name = "kategoria")
    private double kwotaMinimalna;
    @Column(name = "kwotaMinimalna")
    private double kwotaKupTeraz;
    @Column(name = "kwotaKupteraz")
    private String użytkownik;
    @Column(name = "użytkownik")
    private LocalDate dataWystawienia;
    @Column(name = "dataWystawienia")
    private LocalDate dataZakończenia;
    @Column(name = "datazakończenia")
    private int ilośćOdwiedzin;
    @Column(name = "ilośćOdwiedzin")

    public int getIdAukcja() {
        return idAukcja;
    }

    public void setIdAukcja(int idAukcja) {
        this.idAukcja = idAukcja;
    }

    public String getTytuł() {
        return tytuł;
    }

    public void setTytuł(String tytuł) {
        this.tytuł = tytuł;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public double getKwotaMinimalna() {
        return kwotaMinimalna;
    }

    public void setKwotaMinimalna(double kwotaMinimalna) {
        this.kwotaMinimalna = kwotaMinimalna;
    }

    public double getKwotaKupTeraz() {
        return kwotaKupTeraz;
    }

    public void setKwotaKupTeraz(double kwotaKupTeraz) {
        this.kwotaKupTeraz = kwotaKupTeraz;
    }

    public String getUżytkownik() {
        return użytkownik;
    }

    public void setUżytkownik(String użytkownik) {
        this.użytkownik = użytkownik;
    }

    public LocalDate getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(LocalDate dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    public LocalDate getDataZakończenia() {
        return dataZakończenia;
    }

    public void setDataZakończenia(LocalDate dataZakończenia) {
        this.dataZakończenia = dataZakończenia;
    }

    public int getIlośćOdwiedzin() {
        return ilośćOdwiedzin;
    }

    public void setIlośćOdwiedzin(int ilośćOdwiedzin) {
        this.ilośćOdwiedzin = ilośćOdwiedzin;
    }

    @Override
    public String toString() {
        return "aukcjaEntity{" +
                "idAukcja=" + idAukcja +
                ", tytuł='" + tytuł + '\'' +
                ", opis='" + opis + '\'' +
                ", kategoria='" + kategoria + '\'' +
                ", kwotaMinimalna=" + kwotaMinimalna +
                ", kwotaKupTeraz=" + kwotaKupTeraz +
                ", użytkownik='" + użytkownik + '\'' +
                ", dataWystawienia=" + dataWystawienia +
                ", dataZakończenia=" + dataZakończenia +
                ", ilośćOdwiedzin=" + ilośćOdwiedzin +
                '}';
    }
}

