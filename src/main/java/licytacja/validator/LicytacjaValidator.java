package licytacja.validator;

public class LicytacjaValidator {

    public static void validateId(String id) {
        if (id == null) {
            throw new NullPointerException("Id is null");
        }
    }
}