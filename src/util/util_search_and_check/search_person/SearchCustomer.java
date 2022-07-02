package util.util_search_and_check.search_person;

import model.person.Customer;
import model.person.Employee;

import java.util.List;
import java.util.Scanner;

public class SearchCustomer {

    public static int search(List<Customer> customerList){

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int index = -1;

        do {
            System.out.println("Nhập số điện thoại cần tìm: ");
            int numberPhone = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getPhoneNumber() == numberPhone){
                    index = i;
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("Số điện thoại không tồn tại !");
            }
        }while (flag);
        return index;
    }

}
