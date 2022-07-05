package util.util_choices;

import java.util.Scanner;

public class ChoiceRentStyle {

    public static String choice(){
        Scanner scanner = new Scanner(System.in);
        String rentStyle = "";
        boolean flag = true;

        do {
            try {
                System.out.println("Bạn muốn thuê theo ?"
                        + "\n 1. Năm"
                        + "\n 2. Tháng"
                        + "\n 3. Ngày"
                        + "\n 4. Giờ"
                );
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        rentStyle = "Thuê theo năm";
                        flag = false;
                        break;
                    case 2:
                        rentStyle = "Thuê theo tháng";
                        flag = false;
                        break;
                    case 3:
                        rentStyle = "Thuê theo ngày";
                        flag = false;
                        break;
                    case 4:
                        rentStyle = "Thuê theo giờ";
                        flag = false;
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ !");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập số !");
            }
        }while (flag);
        return rentStyle;
    }
}
