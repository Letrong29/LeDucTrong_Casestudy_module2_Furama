package util.util_choices;

import java.util.Scanner;

public class ChoiceRoomStandard {

    public static int choice(){
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.println("Chọn thiêu chuẩn phòng"
                        + "\n 1. 3 sao"
                        + "\n 2. 4 sao"
                        + "\n 3. 5 sao"
                );
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        return 3;
                    case 2:
                        return 4;
                    case 3:
                        return 5;
                    default:
                        System.out.println("Tiêu chuẩn ko hợp lệ ! Chọn lại");
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập số !");
            }
        }while (true);
    }



}
