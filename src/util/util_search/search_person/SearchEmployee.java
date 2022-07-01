package util.util_search.search_person;

import model.person.Employee;
import util.util_read_and_write_file.ReadAndWriteEmployee;

import java.util.List;
import java.util.Scanner;

public class SearchEmployee {

    public static int search(List<Employee> employeeList){

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int index = -1;

        do {
            System.out.println("Nhập số điện thoại cần tìm: ");
            int numberPhone = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getPhoneNumber() == numberPhone){
                    index = i;
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("Số điện thoại không tồn tại !");
            }
        }while (flag);
        return index;
    }

    public static void main(String[] args) {
        String EMPLOYEE_TXT = "src/database/employee.txt";
        List<Employee> employeeList = ReadAndWriteEmployee.read(EMPLOYEE_TXT);

        System.out.println(search(employeeList));
    }
}
