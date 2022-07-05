package util.util_regex;

public class ServiceIdOfHouseRegex {
    public static final String SERVICE_ID_REGEX = "^SVHO-[\\d]{4}$";

    public ServiceIdOfHouseRegex() {
    }

    public static boolean validate(String regex){
        return regex.matches(SERVICE_ID_REGEX);
    }
}
