package util.util_regex;

public class EmailRegex {

    public static final String EMAIL_REGEX = "^[A-Za-z\\d]+@[A-Za-z]+(.com)$";

    public EmailRegex() {

    }

    public static boolean validate(String regex){
        return regex.matches(EMAIL_REGEX);
    }
}
