package util.util_read_and_write_file;

import model.person.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteCustomer {

    public static List<Customer> read(String pathFile){
        List<String> stringList = ReadAndWriteFile.readFile(pathFile);
        List<Customer> customerList = new LinkedList<>();

        String[] array = null;

        for (String string : stringList) {
            array = string.split(",");
            customerList.add(new Customer(
                    array[0],
                    LocalDate.parse(array[1]),
                    array[2],
                    Integer.parseInt(array[3]),
                    Integer.parseInt(array[4]),
                    array[5],
                    Integer.parseInt(array[6]),
                    array[7],
                    array[8]
                    )
            );
        }

        return customerList;
    }

    public static void write(String pathFile, List<Customer> customerList, boolean append){
        List<String> stringList = new LinkedList<>();

        for (Customer customer:customerList) {
            stringList.add(customer.getToCsv());
        }

        ReadAndWriteFile.write(pathFile,stringList,true);
    }

}
