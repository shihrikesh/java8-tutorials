package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static Comparator<Employee> sortByName = Comparator.comparing(Employee::getName);

    // Lambda function
    public static Comparator<Employee> sortBySalary = Comparator.comparing(Employee::getSalary);


    public static void main(String[] args) {
        /*List<Employee> employeeList = new ArrayList<>();
        employeeList.add(Employee.builder().age(25).name("Harry").salary(124578).id(2).build());
        employeeList.add(Employee.builder().age(32).name("Reju").salary(546225).id(1).build());
        employeeList.add(Employee.builder().age(23).name("Ichi").salary(47856).id(6).build());
        employeeList.add(Employee.builder().age(43).name("Neji").salary(42587).id(4).build());
        for (Employee emp : employeeList) {
            System.out.println(emp.toString());
        }
        Collections.sort(employeeList, new EmployeeComparable());

        for (Employee emp : employeeList) {
            System.out.println(emp.toString());
        }


        System.out.println("Sort by name");
        Collections.sort(employeeList, sortByName);

        for (Employee emp : employeeList) {
            System.out.println(emp.toString());
        }

        System.out.println("Sort by Salary in reverse and lambda function");
        //Collections.sort(employeeList, sortBySalary.reversed());

        *//*for (Employee emp : employeeList) {
            System.out.println(emp.toString());
        }*//*

        //employeeList.forEach(employee -> System.out.println(employee.toString()));
        employeeList.stream().sorted(sortBySalary.reversed()).forEach(employee -> System.out.println(employee.toString()));
*/
    }
}
