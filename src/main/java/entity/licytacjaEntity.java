package entity;

import javax.persistence.*;

@Entity
@Table
public class licytacjaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLicytacja;
    @Column(name = "idlicytacja")
    private int idAukcja;
    @Column(name = "idAukcja")
    private int idUżytkownik;
    @Column(name = "idUżytkownik")
    private double kwota;
    @Column(name = "kwota")

    public int getIdLicytacja() {
        return idLicytacja;
    }

    public void setIdLicytacja(int idLicytacja) {
        this.idLicytacja = idLicytacja;
    }

    public int getIdAukcja() {
        return idAukcja;
    }

    public void setIdAukcja(int idAukcja) {
        this.idAukcja = idAukcja;
    }

    public int getIdUżytkownik() {
        return idUżytkownik;
    }

    public void setIdUżytkownik(int idUżytkownik) {
        this.idUżytkownik = idUżytkownik;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    @Override
    public String toString() {
        return "licytacjaEntity{" +
                "idLicytacja=" + idLicytacja +
                ", idAukcja=" + idAukcja +
                ", idUżytkownik=" + idUżytkownik +
                ", kwota=" + kwota +
                '}';
    }
}
