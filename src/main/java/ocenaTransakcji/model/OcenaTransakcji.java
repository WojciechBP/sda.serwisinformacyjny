package ocenaTransakcji.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OcenaTransakcji {

    private int idOcenaTransakcji;
    private int idZakup;
    private String komentarzSprzedajacego;
    private int ocenaKupujacego;
    private String komentarzKupujacego;

}