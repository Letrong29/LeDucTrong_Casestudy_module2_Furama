package controllers;

import service.person_service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeControllers {
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    public static void menu(){
        int choice = 0;
        boolean flag = true;
        do {
            try{
                System.out.println("QUẢNG LÝ NHÂN VIÊN"
                        + "\n 1. Hiển thị danh sách nhân viên"
                        + "\n 2. Thêm nhân viên mới"
                        + "\n 3. Chỉnh sửa thông tin nhân viên"
                        + "\n 4. Trở về menu chính"
                        + "\n Bạn muốn chọn chức năng ?"
                );
                Scanner scanner = new Scanner(System.in);
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("Danh sách nhân viên");
                        employeeService.display();
                        break;
                    case 2:
                        System.out.println("Nhập thông tin nhân viên mới");
                        employeeService.creat();
                        break;
                    case 3:
                        System.out.println("Nhập thông tin chỉnh sửa");
                        employeeService.edit();
                        break;
                    case 4:
                        System.out.println("trở về menu chính");
                        flag = false;
                        break;
                    default:
                        System.out.println("lựa chọn không hợ lệ! mời chọn lại");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập số !");
            }
        }while (flag);
    }
}
