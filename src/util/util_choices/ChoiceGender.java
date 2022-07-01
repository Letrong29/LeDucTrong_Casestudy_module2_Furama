package util.util_choices;

import java.util.Scanner;


public class ChoiceGender {

    public static String choice(){
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        String gender = "";

        do {
            flag = false;
            System.out.println(
                    "Chọn giới tính" + "\n" +
                            "1. Nam" + "\n" +
                            "2. Nữ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    gender = "Nam";
                    break;
                case 2:
                    gender = "Nữ";
                    break;
                default:
                    System.out.println("giới tính sai ! vui long chọn lại");
                    flag = true;
                    break;
            }
        } while (flag);

        return gender;
    }
}
