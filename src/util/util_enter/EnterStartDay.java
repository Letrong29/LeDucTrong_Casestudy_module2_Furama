package util.util_enter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EnterStartDay {

    private static LocalDate enter(){
        Scanner scanner = new Scanner(System.in);

        LocalDate startDay;
        boolean flag = true;

        System.out.println("Nhập ngày bắt đầu");
        do {
            String day = scanner.nextLine();
            startDay = LocalDate.parse(day, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (startDay.isAfter(LocalDate.now())){
                flag = false;
            }else {
                System.out.println("Ngày bắt đầu phải lớn hơn ngày hiện tại !");
            }
        }while (flag);

        return startDay;
    }

}
