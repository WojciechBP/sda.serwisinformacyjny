package obserwacjaAukcji.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ObserwacjaAukcji {
    private int idObserwacjiAukcji;
    private int idAukcji;
    private int idUżytkownika;
}
