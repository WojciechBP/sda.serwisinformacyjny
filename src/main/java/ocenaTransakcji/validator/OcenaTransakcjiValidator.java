package ocenaTransakcji.validator;

public class OcenaTransakcjiValidator {

    public void validateId(String id) {
        if (id == null) {
            throw new NullPointerException("Id is null");
        }
    }
}