package util.util_regex;

public class NameServiceRegex {

    public static final String NAME_SERVICE_REGEX = "^[A-Z][a-z0-9]+$";

    public NameServiceRegex() {
    }

    public static boolean validate(String regex){
        return regex.matches(NAME_SERVICE_REGEX);
    }
}
