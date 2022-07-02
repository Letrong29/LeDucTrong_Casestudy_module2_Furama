package util.util_enter;

import java.util.Scanner;

public class EnterCustomerID {

    public static int enter(){
        Scanner scanner = new Scanner(System.in);

        int customerID = 0;
        do {
            try {
                System.out.println("Nhập mã khách hàng");
                customerID = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai định dạng ! nhập số");
            }
        }while (true);


        return customerID;
    }
}
