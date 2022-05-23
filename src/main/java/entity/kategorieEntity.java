package entity;

import javax.persistence.*;

@Entity
@Table
public class kategorieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idKategoria;
    @Column(name = "idKategoria")
    private String kategoria;
    @Column(name = "kategoria")
    private String nazwaOpisowa;
    @Column(name = "nazwaOpisowa")

        public int getIdkategoria() {
                return idKategoria;
        }

        public void setIdkategoria(int idkategoria) {
                this.idKategoria = idkategoria;
        }

        public String getKategoria() {
                return kategoria;
        }

        public void setKategoria(String kategoria) {
                this.kategoria = kategoria;
        }

        public String getNazwaOpisowa() {
                return nazwaOpisowa;
        }

        public void setNazwaOpisowa(String nazwaOpisowa) {
                this.nazwaOpisowa = nazwaOpisowa;
        }

        @Override
        public String toString() {
                return "kategorieEntity{" +
                        "idkategoria=" + idKategoria +
                        ", kategoria='" + kategoria + '\'' +
                        ", nazwaOpisowa='" + nazwaOpisowa + '\'' +
                        '}';
        }
}
