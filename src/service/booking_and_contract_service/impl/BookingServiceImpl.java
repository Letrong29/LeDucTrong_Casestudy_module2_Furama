package service.booking_and_contract_service.impl;

import model.facility.Facility;
import model.person.Customer;
import service.booking_and_contract_service.interface_booking_and_contract_service.IBookingService;
import util.util_enter.EnterBookingID;

import java.time.LocalDate;

public class BookingServiceImpl implements IBookingService {

//    private int bookingID;
//    private LocalDate startDay;
//    private LocalDate endDay;
//    private Customer getCustomerID;
//    private Facility nameService;
//    private Facility serviceID;
    @Override
    public void creat() {

        int bookingID = EnterBookingID.enter();

    }

    @Override
    public void display() {

    }

    @Override
    public void createNewContracts() {

    }

    @Override
    public void displayListContracts() {

    }

    @Override
    public void edit() {

    }


}
