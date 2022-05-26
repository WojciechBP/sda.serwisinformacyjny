package obserwacjaAukcji.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ObserwacjaAukcji {
    private int idObserwacjiAukcji;
    private int idAukcji;
    private int idUżytkownika;
}
