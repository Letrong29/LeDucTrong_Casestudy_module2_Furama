package util.util_enter;

import util.util_regex.ServiceIdOfHouseRegex;
import util.util_regex.ServiceIdOfRoomRegex;
import util.util_regex.ServiceIdOfVilaRegex;

import java.util.Scanner;

public class EnterServiceID {

    public static String ofVilla(){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập mã dịch vụ: ");
            String serviceID = scanner.nextLine();
            if (ServiceIdOfVilaRegex.validate(serviceID)){
                return serviceID;
            }else {
                System.out.println("Nhập sai định dạng !");
            }
        }while (true);
    }


    public static String ofHouse(){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập mã dịch vụ:");
            String serviceID = scanner.nextLine();
            if (ServiceIdOfHouseRegex.validate(serviceID)){
                return serviceID;
            }else {
                System.out.println("Nhập sai định dạng !");
            }
        }while (true);
    }

    public static String ofRoom(){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập mã dịch vụ: ");
            String serviceID = scanner.nextLine();
            if (ServiceIdOfRoomRegex.validate(serviceID)){
                return serviceID;
            }else {
                System.out.println("Nhập sai định dạng !");
            }
        }while (true);
    }



}
