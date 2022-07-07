package util.util_enter;

import java.util.Scanner;

public class EnterAreaOf {

    public static double usable(){
        Scanner scanner = new Scanner(System.in);
        double usableArea;
        System.out.println("Nhập diện tích sử dụng (m2)");

        do {
            try {
                usableArea = Double.parseDouble(scanner.nextLine());
                if (usableArea > 30){
                    break;
                }else {
                    System.out.println("Diện tích phải lớp hơn 30m2");
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập số !");
            }
        }while (true);

        return usableArea;
    }

    public static double pool(){
        Scanner scanner = new Scanner(System.in);
        double usableArea;
        System.out.println("Nhập diện tích hồ bơi (m2)");

        do {
            try {
                usableArea = Double.parseDouble(scanner.nextLine());
                if (usableArea > 30){
                    break;
                }else {
                    System.out.println("Diện tích phải lớp hơn 30m2");
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập số !");
            }
        }while (true);

        return usableArea;
    }

}
