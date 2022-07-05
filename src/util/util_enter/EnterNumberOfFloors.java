package util.util_enter;

import java.util.Scanner;

public class EnterNumberOfFloors {

    public static int enter(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số tầng");
        int numberOfFloorsl = 0;
        do {
            try {
                numberOfFloorsl = Integer.parseInt(scanner.nextLine());
                if (numberOfFloorsl < 1){
                    System.out.println("Số tầng phải lớn hơn 0 !");
                }else {
                    return numberOfFloorsl;
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập số !");
            }
        }while (true);
    }
}
