package util.util_regex;

public class ServiceIdOfVilaRegex {

    public static final String SERVICE_ID_REGEX = "^SVVL-[\\d]{4}$";

    public ServiceIdOfVilaRegex() {

    }

    public static boolean validate(String regex){
        return regex.matches(SERVICE_ID_REGEX);
    }
}
