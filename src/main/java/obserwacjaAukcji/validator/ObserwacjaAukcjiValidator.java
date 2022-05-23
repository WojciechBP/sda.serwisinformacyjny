package obserwacjaAukcji.validator;

public class ObserwacjaAukcjiValidator {

    public void validateId(String id) {
        if (id == null) {
            throw new NullPointerException("Id is null");
        }
    }
}