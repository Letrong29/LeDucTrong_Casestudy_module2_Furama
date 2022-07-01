package util.util_enter;

import util.util_regex.NumberPhoneRegex;

import java.util.Scanner;

public class EnterNumberPhone {

    public static int enter(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String numberPhone = "";

        do {
            System.out.println("Nhập số điện thoại");
            numberPhone = scanner.nextLine();

            if (NumberPhoneRegex.validate(numberPhone)){
                flag = false;
            }else {
                System.out.println("Nhập sai định dạng !");
            }

        }while (flag);

        return Integer.parseInt(numberPhone);
    }
}
