package util.util_regex;

public class ServiceIdOfRoomRegex {
    public static final String SERVICE_ID_REGEX = "^SVRO-[\\d]{4}$";

    public ServiceIdOfRoomRegex() {
    }

    public static boolean validate(String regex){
        return regex.matches(SERVICE_ID_REGEX);
    }
}
