package util.util_enter;

import java.util.Scanner;

public class EnterSalary {

    public static int enter(){
        Scanner scanner = new Scanner(System.in);

        int salary = 0;

        do {
            try {
                System.out.println("Nhập lương");
                salary = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai định dạng ! nhập số");
            }
        }while (true);

        return salary;
    }
}
