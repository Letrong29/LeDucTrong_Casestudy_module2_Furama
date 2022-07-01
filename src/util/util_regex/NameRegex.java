package util.util_regex;

import java.util.Scanner;

public class NameRegex {
    private static final String NAME_REGEX = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)+$";

    public NameRegex() {

    }

    public static boolean validate(String regex){
        return regex.matches(NAME_REGEX);
    }
}
