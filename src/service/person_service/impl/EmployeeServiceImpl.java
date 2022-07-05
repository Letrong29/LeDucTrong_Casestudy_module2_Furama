package service.person_service.impl;

import model.person.Employee;
import service.person_service.interface_person_service.IEmployeeService;
import util.util_enter.*;
import util.util_choices.ChoiceAcademyLevel;
import util.util_choices.ChoiceGender;
import util.util_choices.ChoicePosition;
import util.util_read_and_write_file.ReadAndWriteEmployee;
import util.util_search_and_check.search_person.SearchEmployee;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static Scanner scanner = new Scanner(System.in);
    static String EMPLOYEE_TXT = "src/database/employee.txt";

    @Override
    public void creat() { // thêm nhân viên mới
        List<Employee> employeeList = ReadAndWriteEmployee.read(EMPLOYEE_TXT);

        String name = EnterName.enter();

        LocalDate birthDay = EnterBirthDay.enter();

        String gender = ChoiceGender.choice();

        int id = EnterID.ofEmployee(employeeList);

        int phoneNumber = EnterNumberPhone.ofEmployee(employeeList);

        String email = EnterEmail.enter();

        int employeeID = EnterEmployeeID.enter();

        String academyLevel = ChoiceAcademyLevel.choice();

        String position = ChoicePosition.choice();

        int salary = EnterSalary.enter();

        employeeList.add(new Employee(name, birthDay, gender, id, phoneNumber, email, employeeID, academyLevel, position, salary));
        System.out.println("---< Thêm mới thành công >---");

        ReadAndWriteEmployee.write(EMPLOYEE_TXT, employeeList, true);
    }

    @Override
    public void display() {
        List<Employee> employeeList = ReadAndWriteEmployee.read(EMPLOYEE_TXT); // Code đọc file
        for (Employee employee: employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void edit() {
        List<Employee> employeeList = ReadAndWriteEmployee.read(EMPLOYEE_TXT);

        int index = SearchEmployee.search(employeeList);

        if (index != -1){
            System.out.println(employeeList.get(index));
            System.out.println("Bạn muốn thay đổi thông tin nào ? \n" +
                    "1. Thay đổi Họ và tên \n" +
                    "2. Thay đổi ngày tháng năm sinh \n" +
                    "3. Thay đổi giới tính \n" +
                    "4. Thay đổi số CMND \n" +
                    "5. Thay đổi số điện thoại \n" +
                    "6. Thay đổi địa chỉ Email \n" +
                    "7. Thay đổi mã nhân viên \n" +
                    "8. Thay đổi trình độ \n" +
                    "9. Thay đổi chức vụ \n" +
                    "10. Thay đổi lương");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    String name = EnterName.enter();
                    employeeList.get(index).setName(name);
                    System.out.println("Cập nhập tên thành công");
                    break;
                case 2:
                    LocalDate birthDay = EnterBirthDay.enter();
                    employeeList.get(index).setBirthday(birthDay);
                    System.out.println("Cập nhập ngày sinh thành công");
                    break;
                case 3:
                    String gender = ChoiceGender.choice();
                    employeeList.get(index).setGender(gender);
                    System.out.println("Chập nhập giới tính thành công");
                    break;
                case 4:
                    int id = EnterID.ofEmployee(employeeList);
                    employeeList.get(index).setId(id);
                    System.out.println("Chập nhập số CMND thành công");
                    break;
                case 5:
                    int phoneNumber = EnterNumberPhone.ofEmployee(employeeList);
                    employeeList.get(index).setPhoneNumber(phoneNumber);
                    System.out.println("Chập nhập số điện thoại thành công");
                    break;
                case 6:
                    String email = EnterEmail.enter();
                    employeeList.get(index).setEmail(email);
                    System.out.println("Chập nhập địa chỉ Email thành công");
                    break;
                case 7:
                    int employeeID = EnterEmployeeID.enter();
                    employeeList.get(index).setEmployeeID(employeeID);
                    System.out.println("Chập nhập mã nhân viên thành công");
                    break;
                case 8:
                    String academyLevel = ChoiceAcademyLevel.choice();
                    employeeList.get(index).setAcademyLevel(academyLevel);
                    System.out.println("Chập nhập thành công");
                    break;
                case 9:
                    String position = ChoicePosition.choice();
                    employeeList.get(index).setPosition(position);
                    System.out.println("Chập nhập chức vụ thành công");
                    break;
                case 10:
                    int salary = EnterSalary.enter();
                    employeeList.get(index).setSalary(salary);
                    System.out.println("Chập nhập lương thành công");
                    break;
                default:
                    System.out.println("Chọn sai !");
                    break;
            }
        }
        ReadAndWriteEmployee.write(EMPLOYEE_TXT,employeeList,true);
    }


}
