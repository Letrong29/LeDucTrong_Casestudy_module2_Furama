package util.util_enter;

import util.util_regex.EmailRegex;

import java.util.Scanner;

public class EnterEmail {

    public static String enter(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String email = "";

        do {
            System.out.println("Nhập địa chỉ Email");
            email = scanner.nextLine();

            if (EmailRegex.validate(email)){
                flag = false;
            }else {
                System.out.println("Nhập sai định dạng !");
            }
        }while (flag);

        return email;
    }

}
