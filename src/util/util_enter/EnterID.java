package util.util_enter;

import util.util_regex.IDRegex;

import java.util.Scanner;

public class EnterID {

    public static int enter(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String stringID;

        do {
            System.out.println("Nhập số CMND");
            stringID = scanner.nextLine();
            if (IDRegex.validate(stringID)){
                flag = false;
            }else {
                System.out.println("Nhập sai định dạng !");
            }
        }while (flag);
        return Integer.parseInt(stringID);
    }
}
