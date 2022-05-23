package aukcja.validator;

public class AukcjaValidator {
    public void validateId(String id) {
        if (id == null) {
            throw new NullPointerException("Id is null");
        }
    }
}
