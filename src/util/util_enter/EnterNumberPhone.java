package util.util_enter;

import model.person.Customer;
import model.person.Employee;
import util.util_regex.NumberPhoneRegex;
import util.util_search_and_check.search_person.CheckCustomer;
import util.util_search_and_check.search_person.CheckEmployee;

import java.util.List;
import java.util.Scanner;

public class EnterNumberPhone {

    public static int ofEmployee(List<Employee> employeeList){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String numberPhone = "";

        do {
            System.out.println("Nhập số điện thoại");
            numberPhone = scanner.nextLine();

            if (NumberPhoneRegex.validate(numberPhone)){
                if (CheckEmployee.checkNumberPhone(employeeList, Integer.parseInt(numberPhone))){
                    flag = false;
                }else {
                    System.out.println("Số điện thoại đã tồn tại !");
                }
            }else {
                System.out.println("Nhập sai định dạng !");
            }

        }while (flag);

        return Integer.parseInt(numberPhone);
    }

    public static int ofCustomer(List<Customer> customerList){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String numberPhone = "";

        do {
            System.out.println("Nhập số điện thoại");
            numberPhone = scanner.nextLine();

            if (NumberPhoneRegex.validate(numberPhone)){
                if (CheckCustomer.checkNumberPhone(customerList, Integer.parseInt(numberPhone))){
                    flag = false;
                }else {
                    System.out.println("Số điện thoại đã tồn tại !");
                }
            }else {
                System.out.println("Nhập sai định dạng !");
            }

        }while (flag);

        return Integer.parseInt(numberPhone);
    }
}
