package util.util_choices;

import java.util.Scanner;

public class ChoicePosition {

    public static String choice(){
        Scanner scanner = new Scanner(System.in);
        String position = "";
        boolean flag;

        do {
            flag = false;
            System.out.println("Chọn chức vụ: " + "\n" +
                    "1. Lễ Tân" + "\n" +
                    "2. Phục Vụ" + "\n" +
                    "3. Chuyên Viên" + "\n" +
                    "4. Giám Sát" + "\n" +
                    "5. Quảng Lý" + "\n" +
                    "6. Giám Đốc"
            );
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    position = "Lễ Tân";
                    break;
                case 2:
                    position = "Phục Vụ";
                    break;
                case 3:
                    position = "Chuyên Viên";
                    break;
                case 4:
                    position = "Giám Sát";
                    break;
                case 5:
                    position = "Quảng Lý";
                    break;
                case 6:
                    position = "Giám Đốc";
                    break;
                default:
                    System.out.println("Chọn sai ! vui long chọn lại");
                    flag = true;
                    break;
            }

        }while (flag);

        return  position;
    }
}
