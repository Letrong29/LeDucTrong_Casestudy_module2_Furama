package util.util_enter;

import java.util.Scanner;

public class EnterBookingID {

    public static int enter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập mã booking");
        int bookingID = 0;
        boolean flag = true;

        do {
            try {
                bookingID = Integer.parseInt(scanner.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Nhập số !");
            }
        } while (flag);
        return bookingID;
    }
}
