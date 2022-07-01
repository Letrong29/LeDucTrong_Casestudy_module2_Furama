package service.person_service.impl;

import model.person.Employee;
import service.person_service.interface_person_service.IEmployeeService;
import util.util_enter.*;
import util.util_choices.ChoiceAcademyLevel;
import util.util_choices.ChoiceGender;
import util.util_choices.ChoicePosition;
import util.util_read_and_write_file.ReadAndWriteEmployee;

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

        int id = EnterID.enter();

        int phoneNumber = EnterNumberPhone.enter();

        String email = EnterEmail.enter();

        int employeeID = EnterEmployeeID.enter();

        String academyLevel = ChoiceAcademyLevel.choice();

        String position = ChoicePosition.choice();

        int salary = EnterSalary.enter();

        employeeList.add(new Employee(name, birthDay, gender, id, phoneNumber, email, employeeID, academyLevel, position, salary));
        System.out.println("Thêm mới thành công");

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
        List<Employee> employeeList = null; // Code đọc file

        // Chỉnh sửa tên (dùng định dạng regex)
        System.out.println("Chỉnh sửa tên");
        String name = scanner.nextLine();

        // Chỉnh sửa ngày tháng năm sinh (định dạng lại LocalDate)
        System.out.println("Chỉnh sửa ngày tháng năm sinh");
        String day = scanner.nextLine();
        LocalDate birthDay = LocalDate.parse(day);

        // Chỉnh sửa giới tính (dùng class util chọn dới tính)
        System.out.println("Chỉnh sửa giới tính");
        String gender = scanner.nextLine();

        // Chỉnh sửa id (dùng định dạng regex)
        System.out.println("Chỉnh sửa số CMND");
        int id = Integer.parseInt(scanner.nextLine());

        // Chỉnh sửa điện thoại (dùng định dạng regex)
        System.out.println("Chỉnh sửa số điện toại");
        int numberPhone = Integer.parseInt(scanner.nextLine());

        // Chỉnh sửa Email (dùng định dạng regex)
        System.out.println("Chỉnh sửa Email");
        String email = scanner.nextLine();

        // Chỉnh sửa mã nhân viên
        System.out.println("Chỉnh sửa mã nhân viên");
        int employeeID = Integer.parseInt(scanner.nextLine());

        // Chỉnh sửa trình độ học vấn (tạo switch case trong backed util)
        System.out.println("Chỉnh sửa trình độ học vấn");
        String academyLevel = scanner.nextLine();

        // Chỉnh sửa chức vụ (tạo switch case trong backed util)
        System.out.println("Chỉnh sửa chức vụ");
        String position = scanner.nextLine();

        // Chỉnh sửa lương
        System.out.println("Chỉnh sửa lương");
        int salary = Integer.parseInt(scanner.nextLine());

        // dùng 1 class util tìm kiếm (tìm theo tên, theo id, theo sđt),
        // class này trả về index của đối tượng đó trong ArrayList nếu tìm thấy
        // nếu index != -1 thì cho phép nhập thông tin chỉnh sửa, và set lại toàn bộ thông tin
        // ngược lại nếu ko tìm thấy, thì dùng do while cho nhập lại

        //code ghi file
    }

    @Override
    public void delete() {
        // dùng 1 class util tìm kiếm (tìm theo tên, theo id, theo sđt),
        // class này trả về index của đối tượng đó trong ArrayList nếu tìm thấy
        // nếu index != -1 thì hiển thị đối tượng và hỏi ng dùng có thật sự muốn xóa hay không ?
        // ngược lại nếu ko tìm thấy, thì dùng do while cho nhập lại
    }
}
