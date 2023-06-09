package swissre;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeTester {
    public static void main(String[] args) {

        // remove duplicate object from list.
        // answer : implementing equals and hashCode method
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Swiss"));
        employees.add(new Employee(2,"Swiss re"));
        employees.add(new Employee(1,"Swiss"));

        employees = removeDuplicate(employees);

        employees.forEach(System.out::println);
    }

    private static List<Employee> removeDuplicate(List<Employee> employees) {

        Set<Employee> employeeSet = new HashSet<>(employees);

        return new ArrayList<>(employeeSet);
    }
}
