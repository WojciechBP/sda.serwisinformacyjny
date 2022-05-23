package ocenaTransakcji.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OcenaTransakcji {

    private int idOcenaTransakcji;
    private int idZakup;
    private String komentarzSprzedającego;
    private int ocenaKupującego;
    private String komentarzKupującego;

}