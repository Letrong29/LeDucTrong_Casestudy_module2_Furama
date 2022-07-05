package util.util_enter;

import model.person.Customer;
import model.person.Employee;
import util.util_exeption.ElementAlreadyExists;
import util.util_regex.IDRegex;
import util.util_search_and_check.search_person.CheckCustomer;
import util.util_search_and_check.search_person.CheckEmployee;

import java.util.List;
import java.util.Scanner;

public class EnterID {
    // 1. Kiểm tra CMND được nhập có đúng định dạng hay không
    // 2. Nếu đã đúng địng dạng, tiếp tục kiểm tra xem số CMND đã tồn tại hay chưa

    public static int ofEmployee(List<Employee> employeeList){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String stringID;

        do {
            System.out.println("Nhập số CMND");
            stringID = scanner.nextLine();
            if (IDRegex.validate(stringID)){
                try {
                    if (CheckEmployee.checkID(employeeList,Integer.parseInt(stringID))){
                        flag = false;
                    }
                } catch (ElementAlreadyExists e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("Nhập sai định dạng !");
            }
        }while (flag);
        return Integer.parseInt(stringID);
    }



    public static int ofCustomer(List<Customer> customerList){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String stringID;

        do {
            System.out.println("Nhập số CMND");
            stringID = scanner.nextLine();
            if (IDRegex.validate(stringID)){
                try {
                    if (CheckCustomer.checkID(customerList,Integer.parseInt(stringID))){
                        flag = false;
                    }
                } catch (ElementAlreadyExists e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("Nhập sai định dạng !");
            }
        }while (flag);
        return Integer.parseInt(stringID);
    }
}
