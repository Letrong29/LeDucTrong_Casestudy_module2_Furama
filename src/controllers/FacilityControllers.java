package controllers;

import service.facility_service.impl.FacilityServiceImpl;
import service.facility_service.impl.HouseServiceImpl;
import service.facility_service.impl.RoomServiceImpl;
import service.facility_service.impl.VillaServiceImpl;

import java.util.Scanner;

public class FacilityControllers {

    public static void menu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean flag = true;
        do {
           try {
               System.out.println("<=={ QUẢNG LÝ CƠ SỞ HẠ TẦNG }==>"
                       + "\n \t 1. Hiển thị danh sách cơ sở hạ tầng"
                       + "\n \t 2. Thêm hạng mục cơ sở mới"
                       + "\n \t 3. Hiển thị danh sách bảo trì cơ sở"
                       + "\n \t 4. Trở về menu chính"
                       + "\n > [ Bạn muốn chọ chức năng ] <?"
               );
               choice = Integer.parseInt(scanner.nextLine());
               switch (choice) {
                   case 1:
                       System.out.println("> [ Danh sách cơ sở hạ tầng: ] <");
                       facilityService.display();
                       break;
                   case 2:
                       menuAddNewFacility();
                       break;
                   case 3:
                       System.out.println("> [ Danh sách bảo trì cơ sở ] <");
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
               System.out.println("> [ NHập số ! ] <");
           }

        } while (flag);
    }

    public static void menuAddNewFacility(){
        Scanner scanner = new Scanner(System.in);
        VillaServiceImpl villaService = new VillaServiceImpl();
        HouseServiceImpl houseService = new HouseServiceImpl();
        RoomServiceImpl roomService = new RoomServiceImpl();
        int choice;
        boolean flag = true;
        do {
            try {
                System.out.println("> [ Thêm mới cơ sở hạ tầng ] <"
                        + "\n \t 1. Thêm mới Villa"
                        + "\n \t 2. Thêm mới House"
                        + "\n \t 3. Thêm mới Room"
                        + "\n \t 4. Trở về menu chính"
                );
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("> [ Thêm mới Villa ] <");
                        villaService.creat();
                        break;
                    case 2:
                        System.out.println("> [ Thêm mới House ] <");
                        houseService.creat();
                        break;
                    case 3:
                        System.out.println("> [ Thêm mới Room ] <");
                        roomService.creat();
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
                System.out.println("> [ NHập số ! ] <");
            }

        } while (flag);
    }
}
