package util.util_choices;

import java.util.Scanner;

public class ChoiceAcademyLevel {

    public static String choice(){
        Scanner scanner = new Scanner(System.in);
        String academyLevel = "";
        boolean flag = true;

        do {
            try {

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
                        flag = false;
                        break;
                    case 2:
                        academyLevel = "Cao Đẳng";
                        flag = false;
                        break;
                    case 3:
                        academyLevel = "Đại Học";
                        flag = false;
                        break;
                    case 4:
                        academyLevel = "Sau Đại Học";
                        flag = false;
                        break;
                    default:
                        System.out.println("Chọn sai ! vui long chọn lại");
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập số !");
            }

        }while (flag);

        return academyLevel;
    }


}
