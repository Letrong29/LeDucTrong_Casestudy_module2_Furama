package util.util_enter;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EnterBirthDay {

    public static LocalDate enter(){

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        LocalDate birthDay = null;
        LocalDate now = LocalDate.now();

        System.out.println("Nhập ngày tháng năm sinh");
        do {
            try {
                String day = scanner.nextLine();
                birthDay = LocalDate.parse(day, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                int checkAge = Period.between(birthDay, now).getYears();
                if (checkAge > 18 && checkAge < 100){
                    flag = false;
                }else {
                    System.out.println("Đối tượng dưới 18 tuổi hoặc đã quá 100 tuổi ! Nhập lại");
                }
            } catch (DateTimeParseException e) {
                System.out.println("nhập sai định dạng ! xin nhập lại");
            }
        } while (flag);

        return birthDay;
    }
}
