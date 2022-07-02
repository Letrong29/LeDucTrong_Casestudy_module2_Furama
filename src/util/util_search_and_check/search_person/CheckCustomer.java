package util.util_search_and_check.search_person;

import model.person.Customer;
import model.person.Employee;

import java.util.List;

public class CheckCustomer {

    public static boolean checkNumberPhone(List<Customer> customerList, int numberPhone){
        boolean flag = true;
        for (Customer customer : customerList) {
            if (customer.getPhoneNumber() == numberPhone) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean checkID(List<Customer> customerList, int id){
        boolean flag = true;

        for (Customer employee : customerList) {
            if (employee.getId() == id) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
