package controllers;

import java.util.Scanner;

public class FacilityControllers {

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("QUẢNG LÝ CƠ SỞ HẠ TẦNG" + "\n" +
                    "1. Hiển thị danh sách cơ sở hạ tầng" + "\n" +
                    "2. Thêm hạng mục cơ sở mới" + "\n" +
                    "3. Hiển thị danh sách bảo trì cơ sở" + "\n" +
                    "4. Trở về menu chính" + "\n" +
                    "Bạn muốn chọ chức năng ?"
            );
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách cơ sở hạ tầng:");
                    break;
                case 2:
                    System.out.println("Nhập thông tin cơ sở hạ tầng mới");
                    break;
                case 3:
                    System.out.println("Danh sách bảo trì cơ sở");
                    break;
                case 4:
                    System.out.println("Trở về menu chính");
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ! mời chọn lại");
                    break;
            }

        } while (choice != 4);
    }
}
