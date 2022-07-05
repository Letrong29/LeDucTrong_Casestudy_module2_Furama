package util.util_enter;

import model.person.Customer;
import model.person.Employee;
import util.util_exeption.ElementAlreadyExists;
import util.util_read_and_write_file.ReadAndWriteCustomer;
import util.util_regex.NumberPhoneRegex;
import util.util_search_and_check.search_person.CheckCustomer;
import util.util_search_and_check.search_person.CheckEmployee;

import java.util.List;
import java.util.Scanner;

public class EnterNumberPhone {
    // 1. Kiểm tra SĐT được nhập có đúng định dạng hay không ?
    // 2. Nếu đã đúng địng dạng, tiếp tục kiểm tra xem số SĐT đã tồn tại hay chưa ?

    public static int ofEmployee(List<Employee> employeeList){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String numberPhone = "";

        do {
            System.out.println("Nhập số điện thoại");
            numberPhone = scanner.nextLine();

            if (NumberPhoneRegex.validate(numberPhone)){
                try {
                    if (CheckEmployee.checkNumberPhone(employeeList, Integer.parseInt(numberPhone))){
                        flag = false;
                    }
                } catch (ElementAlreadyExists e) {
                    e.printStackTrace();
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
                try {
                    if (CheckCustomer.checkNumberPhone(customerList, Integer.parseInt(numberPhone))){
                        flag = false;
                    }
                } catch (ElementAlreadyExists e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("Nhập sai định dạng !");
            }

        }while (flag);

        return Integer.parseInt(numberPhone);
    }

    public static void main(String[] args) {
        String CUSTOMER_TXT = "src/database/customer.txt";
        List<Customer> customerList = ReadAndWriteCustomer.read(CUSTOMER_TXT);

        System.out.println(ofCustomer(customerList));
    }
}
