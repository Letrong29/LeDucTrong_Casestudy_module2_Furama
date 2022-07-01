package util.util_enter;

import java.util.Scanner;

public class EnterEmployeeID {

    public static int enter(){
        Scanner scanner = new Scanner(System.in);

        int employeeID = 0;
        do {
            try {
                System.out.println("Nhập mã nhân viên");
                employeeID = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai định dạng ! nhập số");
            }
        }while (true);


        return employeeID;
    }
}
