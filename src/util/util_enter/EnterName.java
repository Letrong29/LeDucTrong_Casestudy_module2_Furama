package util.util_enter;

import util.util_regex.NameRegex;

import java.util.Scanner;

public class EnterName {

    public static String enter(){
        Scanner scanner = new Scanner(System.in);

        String name = "";
        boolean flag = true;

        do {
            System.out.println("Nhập Họ Và Tên");
            name = scanner.nextLine();
            if (NameRegex.validate(name)){
                flag = false;
            }else {
                System.out.println("Tên sai định dạng !");
            }
        }while (flag);

        return name;
    }

}
