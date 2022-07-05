package util.util_choices;

import java.util.Scanner;

public class ChoicePosition {

    public static String choice(){
        Scanner scanner = new Scanner(System.in);
        String position = "";
        boolean flag = true;

        do {
            try {
                System.out.println("Chọn chức vụ: "
                        + "\n 1. Lễ Tân"
                        + "\n 2. Phục Vụ"
                        + "\n 3. Chuyên Viên"
                        + "\n 4. Giám Sát"
                        + "\n 5. Quảng Lý"
                        + "\n 6. Giám Đốc"
                );
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        position = "Lễ Tân";
                        flag = false;
                        break;
                    case 2:
                        position = "Phục Vụ";
                        flag = false;
                        break;
                    case 3:
                        position = "Chuyên Viên";
                        flag = false;
                        break;
                    case 4:
                        position = "Giám Sát";
                        flag = false;
                        break;
                    case 5:
                        position = "Quảng Lý";
                        flag = false;
                        break;
                    case 6:
                        position = "Giám Đốc";
                        flag = false;
                        break;
                    default:
                        System.out.println("Chọn sai ! vui long chọn lại");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập số !");
            }
        }while (flag);

        return  position;
    }
}
