package util.util_read_and_write_file;

import model.person.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {

    public static List<Employee> read(String pathFile){
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(pathFile);
        String[] array = null;

        for (String element: stringList) {
            array = element.split(",");
            employeeList.add(
                    new Employee(
                            array[0],
                            LocalDate.parse(array[1]),
                            array[2],
                            Integer.parseInt(array[3]),
                            Integer.parseInt(array[4]),
                            array[5],
                            Integer.parseInt(array[6]),
                            array[7],
                            array[8],
                            Integer.parseInt(array[9])
                    )
            );
        }
        return employeeList;
    }

    public static void write(String pathFile, List<Employee> employeeList, boolean append){
        List<String> stringList = new ArrayList<>();

        for (Employee employee : employeeList) {
            stringList.add(employee.toString());
        }

        ReadAndWriteFile.write(pathFile,stringList,append);
    }

}
