package util.util_read_and_write_file;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;

import java.util.*;

public class ReadAndWriteFacility {

    public static Map<Facility, Integer> read(String pathFile) {
        List<String> stringList = ReadAndWriteFile.readFile(pathFile);
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        String[] array;

        for (String string : stringList) {
            array = string.split(",");
            if (array[5].contains("VL")) {
                facilityIntegerMap.put(
                        new Villa(
                                array[0],
                                Double.parseDouble(array[1]),
                                Integer.parseInt(array[2]),
                                Integer.parseInt(array[3]),
                                array[4],
                                array[5],
                                Integer.parseInt(array[6]),
                                Double.parseDouble(array[7]),
                                Integer.parseInt(array[8])
                        ),
                        Integer.parseInt(array[9]) // value cuar map
                );
            }else if (array[5].contains("HO")){
                facilityIntegerMap.put(
                        new House(
                                array[0],
                                Double.parseDouble(array[1]),
                                Integer.parseInt(array[2]),
                                Integer.parseInt(array[3]),
                                array[4],
                                array[5],
                                Integer.parseInt(array[6]),
                                Integer.parseInt(array[7])
                        ),
                        Integer.parseInt(array[8])
                );
            }else {
                facilityIntegerMap.put(
                        new Room(
                                array[0],
                                Double.parseDouble(array[1]),
                                Integer.parseInt(array[2]),
                                Integer.parseInt(array[3]),
                                array[4],
                                array[5],
                                array[6]
                        ),
                        Integer.parseInt(array[7])
                );
            }
        }
        return facilityIntegerMap;
    }

    public static void write(String pathFile, Map<Facility, Integer> facilityIntegerMap, boolean append) {
        List<String> stringList = new ArrayList<>();

        Set<Facility> facilitySet = facilityIntegerMap.keySet();

        for (Facility facility : facilitySet) {
            stringList.add(facility.getToCsv() + "," + facilityIntegerMap.get(facility));
        }

        ReadAndWriteFile.write(pathFile, stringList, true);
    }
}
