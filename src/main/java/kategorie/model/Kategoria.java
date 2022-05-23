package kategorie.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Kategoria {
    private int idKategoria;
    private String kategoria;
    private String nazwaOpisowa;


}
