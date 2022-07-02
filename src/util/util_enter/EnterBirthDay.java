package util.util_enter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EnterBirthDay {

    public static LocalDate enter(){

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        LocalDate birthDay = null;
        do {
            try {
                System.out.println("Nhập ngày tháng năm sinh");
                String day = scanner.nextLine();
                birthDay = LocalDate.parse(day, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                flag = false;
            } catch (DateTimeParseException e) {
                System.out.println("nhập sai định dạng, xin nhập lại");
            }
        } while (flag);

        return birthDay;
    }
}
