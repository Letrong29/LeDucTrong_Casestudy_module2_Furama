package util.util_search_and_check.search_facility;

import model.facility.Facility;
import util.util_read_and_write_file.ReadAndWriteFacility;

import java.util.Map;

public class CheckFacility {
    static final String FACILITY_TXT = "src/database/facility.txt";

    public static boolean check(String nameService){

        Map<Facility, Integer> facilityIntegerMap = ReadAndWriteFacility.read(FACILITY_TXT);

        for (Facility facility : facilityIntegerMap.keySet()) {
            if (facility.getServiceName().equals(nameService)){
                return false;
            }
        }
        return true;
    }
}
