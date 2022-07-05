package util.util_search_and_check.search_person;

import model.person.Customer;
import util.util_exeption.ElementAlreadyExists;

import java.util.List;

public class CheckCustomer {

    public static boolean checkNumberPhone(List<Customer> customerList, int numberPhone) throws ElementAlreadyExists {
        boolean flag = true;
        for (Customer customer : customerList) {
            if (customer.getPhoneNumber() == numberPhone) {
                throw new ElementAlreadyExists("Số điện thoại đã tồn tại");
            }
        }
        return flag;
    }

    public static boolean checkID(List<Customer> customerList, int id) throws ElementAlreadyExists {
        boolean flag = true;

        for (Customer employee : customerList) {
            if (employee.getId() == id) {
                throw new ElementAlreadyExists("Số CMND đã tồn tại");
            }
        }
        return flag;
    }
}
