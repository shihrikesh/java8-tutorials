package interview.ltiMindtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Employee {

    int id;
    String name;
    Double salary;
    int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public Employee(int id, String name, Double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, age);
    }

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(23, "hrishi", 34000.0, 23));
        employeeList.add(new Employee(13, "sam", 60000.0, 45));
        employeeList.add(new Employee(43, "arijit", 55000.0, 34));
        employeeList.add(new Employee(133, "fiona", 60000.0, 56));
        employeeList.add(new Employee(453, "ankit", 5500000.0, 20));

        // top 3 employee based on salary

        List<Employee> emp =
                employeeList.stream()
                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                        //.limit(3)
                        .toList();
        System.out.println(emp);

        System.out.println(" Print employee with Age greater than 25 ");
        employeeList.stream().filter(e -> e.age > 25).toList().forEach(System.out::println);

        System.out.println(" Group by employee salary , mapping name ");
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary, TreeMap::new, Collectors.mapping(employee -> employee.name, Collectors.toSet())))
                .forEach((key, value) -> System.out.println("key is: " + key + " value is: " + value));

        System.out.println(" Group by employee salary ");
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary))
                .forEach((key, value) -> System.out.println("key is: " + key + " value is: " + value));

        System.out.println(" Sort using Arrays Sort() ");
        Integer[] num = {0, 1, 1, 0, 0, 1, 0, 0, 1, 1};
        Arrays.sort(num);
        for (Integer integer : num) {
            System.out.println(integer);

        }

        System.out.println(" Sort without using Arrays Sort() ");
        Integer[] num1 = new Integer[10];
        Integer[] num2 = new Integer[10];
        Integer[] finalNum = new Integer[10];

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                num1[i] = 0;
            } else {
                num2[i] = 1;
            }
        }

        /*for (int i = 0; i < num1.length; i++) {
            finalNum[i] = ;
        }

        for (int i = 0; i < num2.length; i++) {
            num2[i] = 1;
        }*/
    }
}
