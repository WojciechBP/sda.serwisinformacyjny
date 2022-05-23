package entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class UżytkownikEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

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
    @Column(name = "statuskonta")

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHasło() {
        return hasło;
    }

    public void setHasło(String hasło) {
        this.hasło = hasło;
    }

    public String getNazwaKonta() {
        return nazwaKonta;
    }

    public void setNazwaKonta(String nazwaKonta) {
        this.nazwaKonta = nazwaKonta;
    }

    public LocalDate getDataZałożeniaKonta() {
        return dataZałożeniaKonta;
    }

    public void setDataZałożeniaKonta(LocalDate dataZałożeniaKonta) {
        this.dataZałożeniaKonta = dataZałożeniaKonta;
    }

    public String getWojewództwo() {
        return województwo;
    }

    public void setWojewództwo(String województwo) {
        this.województwo = województwo;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getStatusKonta() {
        return statusKonta;
    }

    public void setStatusKonta(String statusKonta) {
        this.statusKonta = statusKonta;
    }

    @Override
    public String toString() {
        return "UżytkownikEntity{" +
                "idUser=" + idUser +
                ", login='" + login + '\'' +
                ", hasło='" + hasło + '\'' +
                ", nazwaKonta='" + nazwaKonta + '\'' +
                ", dataZałożeniaKonta=" + dataZałożeniaKonta +
                ", województwo='" + województwo + '\'' +
                ", miasto='" + miasto + '\'' +
                ", adres='" + adres + '\'' +
                ", statusKonta='" + statusKonta + '\'' +
                '}';
    }
}
