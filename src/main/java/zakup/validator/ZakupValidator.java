package zakup.validator;

public class ZakupValidator {

    public void validateId(String id) {
        if (id == null) {
            throw new NullPointerException("Id is null");
        }
    }
}
