package controllers;

import java.util.Scanner;

public class PromotionControllers {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("QUẢNG LÝ KHUYẾN MÃI" + "\n" +
                    "1. Hiển thị danh sách khách hàng sử dụng dịch vụ" + "\n" +
                    "2. Hiển thị danh sách khách hàng nhận được voucher" + "\n" +
                    "3. Trở về menu chính" + "\n" +
                    "Bạn muốn chọ chức năng ?"
            );
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Danh sách khách hàng sử dụng dịch vụ");
                    break;
                case 2:
                    System.out.println("Danh sách khách hàng nhận được voucher");
                    break;
                case 3:
                    System.out.println("trở về menu chính");
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ! mời chọn lại");
                    break;
            }

        }while (choice != 3);
    }
}
