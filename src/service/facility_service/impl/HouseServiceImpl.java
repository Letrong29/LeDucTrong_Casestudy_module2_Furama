package service.facility_service.impl;

import model.facility.Facility;
import model.facility.House;
import service.facility_service.interface_facility_service.IHouseService;
import util.util_choices.ChoiceRentStyle;
import util.util_choices.ChoiceRoomStandard;
import util.util_enter.*;
import util.util_read_and_write_file.ReadAndWriteFacility;
import util.util_search_and_check.search_facility.CheckFacility;

import java.util.Map;

public class HouseServiceImpl implements IHouseService {
    static final String FACILITY_TXT = "src/database/facility.txt";


    @Override
    public void creat() {
        Map<Facility, Integer> facilityIntegerMap = ReadAndWriteFacility.read(FACILITY_TXT);

        String nameService = EnterNameFacility.enter();


        if (CheckFacility.check(nameService)){

            double usableArea = EnterAreaOf.usable();
            int rentalCosts = EnterRentalCosts.enter();
            int maxiMumNumberOfPeople = EnterMaxiMumNumberOfPeople.enter();
            String rentStyle = ChoiceRentStyle.choice();
            String serviceID = EnterServiceID.ofHouse();
            int roomStandard = ChoiceRoomStandard.choice();
            int numberOfFloors = EnterNumberOfFloors.enter();

            facilityIntegerMap.put(new House(nameService, usableArea, rentalCosts, maxiMumNumberOfPeople, rentStyle, serviceID, roomStandard, numberOfFloors), 0);
            System.out.println("---< Thêm mới thành công >---");

            ReadAndWriteFacility.write(FACILITY_TXT, facilityIntegerMap, true);

        }else {
            System.out.println("> [ Đối tượng đã tồn tại ! ] <");
        }
    }

    @Override
    public void display() {

    }

    @Override
    public void displayListFacilityMaintenance() {

    }
}
