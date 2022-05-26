package uzytkownik.validator;

public class UserValidator {

    public void validateId(String id) {
        if (id == null) {
            throw new NullPointerException("Id is null");
        }
    }

}
