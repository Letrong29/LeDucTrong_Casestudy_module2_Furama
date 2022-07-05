package util.util_enter;

import util.util_regex.NameServiceRegex;

import java.util.Scanner;

public class EnterNameFacility {

    public static String enter(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Nhập tên cơ sở hạn tầng mới: ");
        String nameFacility = "";
        do {
            nameFacility = scanner.nextLine();
            if (NameServiceRegex.validate(nameFacility)){
                flag = false;
            }else {
                System.out.println("Nhập sai định dạng ! Nhập lại");
            }
        }while (flag);

        return nameFacility;
    }
}
