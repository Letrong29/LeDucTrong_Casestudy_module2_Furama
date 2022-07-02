package util.util_search_and_check.search_person;

import model.person.Employee;

import java.util.List;

public class CheckEmployee {

    public static boolean checkNumberPhone(List<Employee> employeeList, int numberPhone){
        boolean flag = true;
        for (Employee employee : employeeList) {
            if (employee.getPhoneNumber() == numberPhone) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean checkID(List<Employee> employeeList, int id){
        boolean flag = true;

        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                flag = false;
                break;
            }
        }

        return flag;
    }

}
