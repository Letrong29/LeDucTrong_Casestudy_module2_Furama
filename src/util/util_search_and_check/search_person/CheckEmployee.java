package util.util_search_and_check.search_person;

import model.person.Employee;
import util.util_exeption.ElementAlreadyExists;

import java.util.List;

public class CheckEmployee {

    public static boolean checkNumberPhone(List<Employee> employeeList, int numberPhone) throws ElementAlreadyExists {
        boolean flag = true;
        for (Employee employee : employeeList) {
            if (employee.getPhoneNumber() == numberPhone) {
                throw new ElementAlreadyExists("Số điện thoại đã tồn tại !");
            }
        }
        return flag;
    }


    public static boolean checkID(List<Employee> employeeList, int id) throws ElementAlreadyExists {
        boolean flag = true;

        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                throw new ElementAlreadyExists("Số CMND đã tồn tại !");
            }
        }

        return flag;
    }

}
