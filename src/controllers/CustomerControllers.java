package controllers;

import java.util.Scanner;

public class CustomerControllers {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("QUẢNG LÝ KHÁCH HÀNG" + "\n" +
                    "1. Hiển thị danh sách khác hàng" + "\n" +
                    "2. Thêm khách hàng mới" + "\n" +
                    "3. Chỉnh sửa thông tin khách hàng" + "\n"+
                    "4. Trở về menu chính" + "\n" +
                    "Bạn muốn chọ chức năng ?"
                    );
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Danh sách khách hàng:");
                    break;
                case 2:
                    System.out.println("Nhập thông tin khách hàng mới");
                    break;
                case 3:
                    System.out.println("Nhập thông tin chỉnh sửa");
                    break;
                case 4:
                    System.out.println("Trở về menu chính");
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ! mời chọn lại");
                    break;
            }

        }while (choice != 4);
    }
}
