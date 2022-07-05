package util.util_enter;

import java.util.Scanner;

public class EnterMaxiMumNumberOfPeople {

    public static int enter(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng người tối đa");
        int maxiMumNumberOfPeople;

        do {
            try {
                maxiMumNumberOfPeople = Integer.parseInt(scanner.nextLine());
                if (maxiMumNumberOfPeople > 0 && maxiMumNumberOfPeople < 20){
                    break;
                }else {
                    System.out.println("Số người không hợp lệ ! Nhập lại");
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập số !");
            }
        }while (true);

        return maxiMumNumberOfPeople;
    }

}
