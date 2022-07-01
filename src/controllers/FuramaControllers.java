package controllers;

import service.person_service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaControllers {
    public static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("HỆ THỐNG QUẢNG LÝ FURAMA" + "\n" +
                    "1. Quảng lý nhân viên" + "\n" +
                    "2. Quảng lý khách hàng" + "\n" +
                    "3. Quảng lý cơ sở hạ tầng" + "\n" +
                    "4. Quảng lý Booking" + "\n" +
                    "5. Quảng lý khuyến mãi" + "\n" +
                    "6. Thoát" + "\n" +
                    "Vui lòng chọn chức năng"
            );
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    EmployeeControllers.menu();
                    break;
                case 2:
                    CustomerControllers.menu();
                    break;
                case 3:
                    FacilityControllers.menu();
                    break;
                case 4:
                    BookingControllers.menu();
                    break;
                case 5:
                    PromotionControllers.menu();
                    break;
                case 6:
                    System.out.println("Bạn đã thoát hệ thống");
                    System.exit(0);
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ! mời chọn lại");
                    break;
            }
        }while (true);

    }
}
