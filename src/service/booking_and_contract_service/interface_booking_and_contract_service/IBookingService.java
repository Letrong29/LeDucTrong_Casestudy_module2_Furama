package service.booking_and_contract_service.interface_booking_and_contract_service;

import service.IService;

public interface IBookingService extends IService {

    void createNewContracts();

    void displayListContracts();

    void edit();
}
