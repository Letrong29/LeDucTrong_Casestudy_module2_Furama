package util.util_regex;

public class NumberPhoneRegex {

    public static final String NUMBER_PHONE_REGEX = "^(0|84)\\d{9}$";

    public NumberPhoneRegex() {

    }

    public static boolean validate(String regex){
        return regex.matches(NUMBER_PHONE_REGEX);
    }
}
