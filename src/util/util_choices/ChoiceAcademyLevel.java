package util.util_choices;

import java.util.Scanner;

public class ChoiceAcademyLevel {

    public static String choice(){
        Scanner scanner = new Scanner(System.in);
        String academyLevel = "";
        boolean flag = false;

        do {
            flag = false;
            System.out.println("Chọn trình độ học vấn:" + "\n" +
                    "1. Trung Cấp" + "\n" +
                    "2. Cao Đẳng" + "\n" +
                    "3. Đại Học" + "\n" +
                    "4. Sau Đại Học"
            );
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    academyLevel = "Trung Cấp";
                    break;
                case 2:
                    academyLevel = "Cao Đẳng";
                    break;
                case 3:
                    academyLevel = "Đại Học";
                    break;
                case 4:
                    academyLevel = "Sau Đại Học";
                    break;
                default:
                    System.out.println("Chọn sai ! vui long chọn lại");
                    flag = true;
            }
        }while (flag);

        return academyLevel;
    }
}
