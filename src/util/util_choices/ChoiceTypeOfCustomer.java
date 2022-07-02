package util.util_choices;

import java.util.Scanner;

public class ChoiceTypeOfCustomer {

    public static String choice(){
        Scanner scanner = new Scanner(System.in);
        String typeOfCustomer = "";
        boolean flag = false;

        do {
            try {
                System.out.println("Chọn loại khách hàng:"
                        + "\n 1. Diamond"
                        + "\n 2. Platinium"
                        + "\n 3. Gold"
                        + "\n 4. Silver"
                        + "\n 5. Member");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        typeOfCustomer = "Diamond";
                        break;
                    case 2:
                        typeOfCustomer = "Platinium";
                        break;
                    case 3:
                        typeOfCustomer = "Gold";
                        break;
                    case 4:
                        typeOfCustomer = "Silver";
                        break;
                    case 5:
                        typeOfCustomer = "Member";
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ !");
                        flag = true;
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập số !");
                flag = true;
            }

        }while (flag);
        return typeOfCustomer;
    }
}
