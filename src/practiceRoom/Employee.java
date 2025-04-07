package practiceRoom;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {

    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
    public int getId() 
    {
        return id;
    }
    public String getName() 
    {
        return name;
    }
    public int getAge() 
    {
        return age;
    }
    public String getGender() 
    {
        return gender;
    }
    public String getDepartment() 
    {
        return department;
    }
    public int getYearOfJoining()
    {
        return yearOfJoining;
    }
    public double getSalary() 
    {
        return salary;
    }
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        System.out.println();
        // 1. Find out the count of male and female employees present in the organization?
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).forEach((k,v)-> System.out.println( k+ ": " + v));

        // 2. Write a program to print the names of all departments in the organization.

        employeeList.stream().map(Employee::getDepartment).collect(Collectors.toSet()).forEach(System.out::println);

        // 3. Find the average age of Male and Female Employees.

        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)))
                .forEach((k,v)-> System.out.println( k+ ": " + v));


        // 4. Get the Names of employees who joined after 2015.

        employeeList.stream().filter(employee -> employee.getYearOfJoining() >=2015).collect(Collectors.toSet()).forEach(System.out::println);

        // 5. Count the number of employees in each department.

        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .forEach((k,v)-> System.out.println( k+ ": " + v));

        // 6. Find out the average salary of each department.

        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)))
                .forEach((k,v)-> System.out.println( k+ ": " + v));

        // 7. Find out the oldest employee, his/her age and department?
        employeeList.stream()
                .max(Comparator.comparingInt(Employee::getAge))
                .ifPresent(System.out::println);

        // part 2 // 7. Find out the oldest employee, his/her age per department?

        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingInt(Employee::getAge))))
                .forEach((k,v)-> System.out.println( k+ ": " + v));

        // 8. Find out the average and total salary of the organization.
        DoubleSummaryStatistics empSummary = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(empSummary.getAverage());
        System.out.println(empSummary.getSum());

        // 9. List down the employees of each department.
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, LinkedHashMap::new, Collectors.toList()))
                //.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList())) // can provide 2nd parameter as any impl of map
                .forEach((k,v)-> System.out.println( k+ ": " + v));

        // 10. Find out the highest experienced employees in the organization
        employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).ifPresent(System.out::println);

        // using sorted
        employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst().ifPresent(System.out::println);

        // 10. Find out the lowest experienced employees in the organization

        employeeList.stream()
                .max(Comparator.comparingInt(Employee::getYearOfJoining))
                .ifPresent(System.out::println);
        employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining).reversed()).findFirst().ifPresent(System.out::println);

    }


 }