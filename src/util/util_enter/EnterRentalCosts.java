package util.util_enter;

import java.util.Scanner;

public class EnterRentalCosts {

    public static int enter() {
        Scanner scanner = new Scanner(System.in);
        int rentalCosts;
        System.out.println("Nhập chi phí thuê");

        do {
           try {
               rentalCosts = Integer.parseInt(scanner.nextLine());
               if (rentalCosts > 0){
                   break;
               }else {
                   System.out.println("Nhập số dương !");
               }
           }catch (NumberFormatException e){
               System.out.println("Nhập số !");
           }
        }while (true);

        return rentalCosts;
    }
}
