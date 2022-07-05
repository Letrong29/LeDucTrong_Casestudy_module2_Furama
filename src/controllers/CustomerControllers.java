package controllers;

import model.person.Customer;
import service.person_service.impl.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerControllers {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        int choice;
        boolean flag = true;
        do {
            try {
                System.out.println("<=={ QUẢNG LÝ KHÁCH HÀNG }==>"
                       + "\n \t 1. Hiển thị danh sách khác hàng"
                       + "\n \t 2. Thêm khách hàng mới"
                       + "\n \t 3. Chỉnh sửa thông tin khách hàng"
                       + "\n \t 4. Trở về menu chính"
                       + "\n > [Bạn muốn chọn chức năng ? ] <"
                );
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("> [ Danh sách khách hàng ] <");
                        customerService.display();
                        break;
                    case 2:
                        System.out.println("> [ Nhập thông tin khách hàng mới: ] < ");
                        customerService.creat();
                        break;
                    case 3:
                        System.out.println("> [ Chức năng chỉnh sửa: ] <");
                        customerService.edit();
                        break;
                    case 4:
                        System.out.println("> [ Trở về menu chính ] <");
                        flag = false;
                        break;
                    default:
                        System.out.println("> [ lựa chọn không hợp lệ! mời chọn lại ] <");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("> [ Nhập số ] <");
            }

        }while (flag);
    }
}
