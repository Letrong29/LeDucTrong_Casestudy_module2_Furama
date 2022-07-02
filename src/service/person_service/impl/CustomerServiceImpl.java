package service.person_service.impl;

import model.person.Customer;
import service.person_service.interface_person_service.ICustomerService;
import util.util_choices.ChoiceGender;
import util.util_choices.ChoiceTypeOfCustomer;
import util.util_enter.*;
import util.util_read_and_write_file.ReadAndWriteCustomer;
import util.util_search_and_check.search_person.SearchCustomer;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    public static final String CUSTOMER_TXT = "src/database/customer.txt";

    @Override
    public void creat() {
        List<Customer> customerList = ReadAndWriteCustomer.read(CUSTOMER_TXT);
        String name = EnterName.enter();

        LocalDate birthDay = EnterBirthDay.enter();

        String gender = ChoiceGender.choice();

        int id = EnterID.ofCustomer(customerList);

        int phoneNumber = EnterNumberPhone.ofCustomer(customerList);

        String email = EnterEmail.enter();

        int customerId = EnterCustomerID.enter();

        String typeOfCustomer = ChoiceTypeOfCustomer.choice();

        String address = EnterAddress.enter();

        customerList.add(new Customer(name, birthDay, gender, id, phoneNumber, email, customerId, typeOfCustomer, address));
        System.out.println("Thêm mới thành công");

        ReadAndWriteCustomer.write(CUSTOMER_TXT, customerList, true);
    }

    @Override
    public void display() {
        List<Customer> customerList = ReadAndWriteCustomer.read(CUSTOMER_TXT);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }

    }

    @Override
    public void edit() {
        List<Customer> customerList = ReadAndWriteCustomer.read(CUSTOMER_TXT);

        int index = SearchCustomer.search(customerList);

        if (index != -1) {
            System.out.println(customerList.get(index));
            System.out.println("Bạn muốn thay đổi thông tin nào ? "
                    + "\n 1. Thay đổi Họ và tên"
                    + "\n 2. Thay đổi ngày tháng năm sinh"
                    + "\n 3. Thay đổi giới tính"
                    + "\n 4. Thay đổi số CMND"
                    + "\n 5. Thay đổi số điện thoại"
                    + "\n 6. Thay đổi địa chỉ Email"
                    + "\n 7. Thay đổi mã khách hàng"
                    + "\n 8. Thay đổi loại khách hàng"
                    + "\n 9. Thay đổi địa chỉ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    String name = EnterName.enter();
                    customerList.get(index).setName(name);
                    System.out.println("Cập nhật tên thành công");
                    break;
                case 2:
                    LocalDate birthDay = EnterBirthDay.enter();
                    customerList.get(index).setBirthday(birthDay);
                    System.out.println("Cập nhật ngày sinh thành công");
                    break;
                case 3:
                    String gender = ChoiceGender.choice();
                    customerList.get(index).setGender(gender);
                    System.out.println("Chập nhật giới tính thành công");
                    break;
                case 4:
                    int id = EnterID.ofCustomer(customerList);
                    customerList.get(index).setId(id);
                    System.out.println("Chập nhật số CMND thành công");
                    break;
                case 5:
                    int phoneNumber = EnterNumberPhone.ofCustomer(customerList);
                    customerList.get(index).setPhoneNumber(phoneNumber);
                    System.out.println("Chập nhật số điện thoại thành công");
                    break;
                case 6:
                    String email = EnterEmail.enter();
                    customerList.get(index).setEmail(email);
                    System.out.println("Chập nhật địa chỉ Email thành công");
                    break;
                case 7:
                    int customerID = EnterCustomerID.enter();
                    customerList.get(index).setCustomerID(customerID);
                    System.out.println("Chập nhật mã khách hàng thành công");
                    break;
                case 8:
                    String typeOfCustomer = ChoiceTypeOfCustomer.choice();
                    customerList.get(index).setTypeOfCustomer(typeOfCustomer);
                    System.out.println("Chập nhật loại khách hàng thành công");
                    break;
                case 9:
                    String address = EnterAddress.enter();
                    customerList.get(index).setAddress(address);
                    System.out.println("Chập nhật địa chỉ thành công");
                    break;
                default:
                    System.out.println("Chọn sai !");
                    break;
            }
        }

        ReadAndWriteCustomer.write(CUSTOMER_TXT, customerList, true);
    }

    @Override
    public void delete() {

    }
}
