package service.facility_service.impl;


import model.facility.Facility;
import service.facility_service.interface_facility_service.IFacilityService;
import util.util_read_and_write_file.ReadAndWriteFacility;

import java.util.Map;
import java.util.Set;

public class FacilityServiceImpl implements IFacilityService {
    static final String FACILITY_TXT = "src/database/facility.txt";

    @Override
    public void creat() {

    }

    @Override
    public void display() {
        Map<Facility, Integer> facilityIntegerMap = ReadAndWriteFacility.read(FACILITY_TXT);

        Set<Facility> facilitySet = facilityIntegerMap.keySet();

        for (Facility facility : facilitySet) {
            System.out.println(facility);
        }
    }


    @Override
    public void displayListFacilityMaintenance() {
        Map<Facility, Integer> facilityIntegerMap = ReadAndWriteFacility.read(FACILITY_TXT);

        if (facilityIntegerMap.isEmpty()){
            System.out.println("> [ Chưa có dữ liệu ] <");
            return;
        }

        for (Facility facility: facilityIntegerMap.keySet()) {
            if (facilityIntegerMap.get(facility) == 5){
                System.out.println(facility);
            }
        }
    }
}
