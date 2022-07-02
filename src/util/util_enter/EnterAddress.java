package util.util_enter;

import java.util.Scanner;

public class EnterAddress {

    public static String enter(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        return address;
    }
}
