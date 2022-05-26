package entity;

import lombok.*;

import javax.persistence.*;
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "kategoria")
public class KategorieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idKategoria;
    @Column(name = "idKategoria")
    private String kategoria;
    @Column(name = "kategoria")
    private String nazwaOpisowa;

}
