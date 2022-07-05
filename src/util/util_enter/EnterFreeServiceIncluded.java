package util.util_enter;

import java.util.Scanner;

public class EnterFreeServiceIncluded {

    public static String enter(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập dịch vụ miễn phí đi kièm");
        String freeServiceIncluded = scanner.nextLine();

        return freeServiceIncluded;
    }
}
