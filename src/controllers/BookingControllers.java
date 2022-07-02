package controllers;

import java.util.Scanner;

public class BookingControllers {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean flag = true;
        do {
            try {
                System.out.println("QUẢNG LÝ BOOKING"
                        + "\n 1. Thêm Booking mới"
                        + "\n 2. Hiển thị danh sách Booking"
                        + "\n 3. Thêm hợp đồng mới"
                        + "\n 4. Hiển thị danh sách hợp đồng"
                        + "\n 5. Chỉnh sửa hợp đồng"
                        + "\n 6. Trở về menu chính"
                        + "\n Bạn muốn chọ chức năng ?"
                );
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("Nhập thông tin Booking mới");
                        break;
                    case 2:
                        System.out.println("Danh sách Booking");
                        break;
                    case 3:
                        System.out.println("Nhập thông tin hợp đồng");
                        break;
                    case 4:
                        System.out.println("Danh sách hợp đồng");
                        break;
                    case 5:
                        System.out.println("Chỉnh sửa hợp đồng");
                        break;
                    case 6:
                        System.out.println("trở về menu chính");
                        flag = false;
                        break;
                    default:
                        System.out.println("lựa chọn không hợp lệ! mời chọn lại");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập số");
            }

        }while (flag);
    }
}
