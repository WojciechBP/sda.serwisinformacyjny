package kategorie.validator;

public class KategoriaValidator {
    public void validateId(String id) {
        if (id == null) {
            throw new NullPointerException("Id is null");
        }
    }
}
