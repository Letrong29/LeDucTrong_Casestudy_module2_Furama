package util.util_choices;

import java.util.Scanner;


public class ChoiceGender {

    public static String choice(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String gender = "";

        do {
            try {
                System.out.println(
                        "Chọn giới tính" + "\n" +
                                "1. Nam" + "\n" +
                                "2. Nữ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        gender = "Nam";
                        flag = false;
                        break;
                    case 2:
                        gender = "Nữ";
                        flag = false;
                        break;
                    default:
                        System.out.println("giới tính sai ! vui long chọn lại");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập số !");
            }
        } while (flag);

        return gender;
    }
}
