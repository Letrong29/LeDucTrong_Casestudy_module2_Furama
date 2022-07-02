package util.util_enter;

import model.person.Customer;
import model.person.Employee;
import util.util_regex.IDRegex;
import util.util_search_and_check.search_person.CheckCustomer;
import util.util_search_and_check.search_person.CheckEmployee;

import java.util.List;
import java.util.Scanner;

public class EnterID {

    // Chứng minh nhân dân của khách hàng
    public static int ofEmployee(List<Employee> employeeList){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String stringID;

        do {
            System.out.println("Nhập số CMND");
            stringID = scanner.nextLine();
            if (IDRegex.validate(stringID)){
                if (CheckEmployee.checkID(employeeList,Integer.parseInt(stringID))){
                    flag = false;
                }else {
                    System.out.println("Số CMND đã tồn tại !");
                }
            }else {
                System.out.println("Nhập sai định dạng !");
            }
        }while (flag);
        return Integer.parseInt(stringID);
    }

    // Chứng minh nhân dân của khách hàng
    public static int ofCustomer(List<Customer> customerList){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String stringID;

        do {
            System.out.println("Nhập số CMND");
            stringID = scanner.nextLine();
            if (IDRegex.validate(stringID)){
                if (CheckCustomer.checkID(customerList,Integer.parseInt(stringID))){
                    flag = false;
                }else {
                    System.out.println("Số CMND đã tồn tại !");
                }
            }else {
                System.out.println("Nhập sai định dạng !");
            }
        }while (flag);
        return Integer.parseInt(stringID);
    }
}
