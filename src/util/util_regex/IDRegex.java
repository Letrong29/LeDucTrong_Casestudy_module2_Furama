package util.util_regex;

public class IDRegex {
    public static final String ID_REGEX = "^\\d{9}$";

    public IDRegex() {

    }

    public static boolean validate(String regex){
        return regex.matches(ID_REGEX);
    }
}
