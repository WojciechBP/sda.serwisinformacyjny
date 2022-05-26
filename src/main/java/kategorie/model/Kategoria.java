package kategorie.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Kategoria {
    private int idKategoria;
    private String nazwa;
    private String nazwaOpisowa;


}
