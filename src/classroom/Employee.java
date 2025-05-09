package classroom;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {

    int id;

    String name;

    int age;

    String gender;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && yearOfJoining == employee.yearOfJoining && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(gender, employee.gender) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, gender, department, yearOfJoining, salary);
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    String department;

    public Employee() {

    }

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    int yearOfJoining;

    double salary;

    public static void main(String[] args) throws IOException, NoSuchFieldException {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "AccountComparable And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "AccountComparable And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
        employeeList.add(new Employee(278, "Gunja Bansi", 31, "Female", "Product Development", 2012, 35700.0));
        employeeList.add(new Employee(277, "Sambhav Yashashvi", 31, "Male", "Product Development", 2010, 35700.0));

        /* groupingBy(Function, Collector),
        groupingBy(Function),
        groupingByConcurrent(Function, Supplier, Collector)*/

        // 1: groupByGenderAndCalculateAverageAge What is the average age of male and female employees?

        System.out.println(" What is the average age of male and female employees? ");
        System.out.println("********* START *********");

        Map<String, Double> groupByGenderAndCalculateAverageAge = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, TreeMap::new, Collectors.averagingInt(Employee::getAge)));

        groupByGenderAndCalculateAverageAge.forEach((k, v) -> System.out.println(k + " Employee having average Salary " + v));

        System.out.println("********* END *********");

        // 2: How many male and female employees are there in the organization?
        System.out.println(" How many male and female employees are there in the organization? ");
        System.out.println("********* START *********");
        Map<String, Long> groupByGenderAndCount = employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        // Collectors.groupingBy(Employee::getGender, HashMap::new, Collectors.counting()));  // could be used for specifying collection
        groupByGenderAndCount.forEach((k, v) -> System.out.println(k + " Employee Count " + v));

        System.out.println("********* END *********");

        // 3: Print the name of all departments in the organization?

        System.out.println(" Print the name of all departments in the organization ");
        System.out.println("********* START *********");
        List<String> allDepartmentList = employeeList
                .stream()
                .map(Employee::getDepartment)
                .distinct()
                .toList();
        allDepartmentList.forEach(System.out::println);
        System.out.println("********* END *********");

        // 4: Sort Employee based on salary

        System.out.println(" Sort Employee based on salary ");
        System.out.println("********* START *********");
        List<Employee> sortByEmployeeSalary = employeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();

        sortByEmployeeSalary.forEach(System.out::println);
        System.out.println("********* END *********");

        // 5: Sort Employee based on salary and Group by (Per) department

        System.out.println(" Sort Employee based on salary and Group by (Per) department ");
        System.out.println("********* START *********");
        Map<String, List<Employee>> sortBySalaryAndGroupByDepartment = employeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.groupingBy(Employee::getDepartment));

        sortBySalaryAndGroupByDepartment
                .forEach((k, v) -> System.out.println(k + " department having employees " + v));
        System.out.println("********* END *********");

        // 6: Get the details of highest paid employee in the organization?

        System.out.println(" Get the details of highest paid employee in the organization? ");
        System.out.println("********* START *********");
        System.out.println("First sort then reverse, then find one value only");
        List<Employee> employeeWithHighestSalary = employeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary)
                        .reversed())
                .limit(1) // set how many number want to see
                //.skip(0) //
                .collect(Collectors.toList());

        employeeWithHighestSalary.forEach(System.out::println);


        System.out.println("With Max and Comparator with optionals");
        Employee maxByEmployeeSalary = employeeList
                .stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(IOException::new);

        System.out.println(maxByEmployeeSalary);
        System.out.println("********* END *********");

        // 7: Get the names of all employees who have joined after 2015?

        System.out.println("Get the names of all employees who have joined after 2015? ***************");
        System.out.println("********* START *********");

        employeeList
                .stream()
                .filter(employee -> employee.getYearOfJoining() > 2015)
                .map(employee -> employee.name).forEach(System.out::println);

        System.out.println("********* END *********");

        // 8: Count the number of employees in each department?
        System.out.println("Count the number of employees in each department? ***************");
        System.out.println("********* START *********");
        //Map<String, Long> countEmployeeGroupByDepartment =
        employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + ": department having " + v + " number of employees "));

        System.out.println("********* END *********");
        // 9: What is the average salary of each department?

        System.out.println(" What is the average salary of each department? *******************");
        System.out.println("********* START *********");
        employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                .forEach((k, v) -> System.out.println(k + ": department having " + v + " average salary "));

        System.out.println("********* END *********");
        // 10: Get the details of youngest male employee in the product development department?

        System.out.println(" Get the details of youngest male employee in the product development department? ********");
        System.out.println("********* START *********");
        Employee youngestEmployee = employeeList
                .stream()
                .filter(employee -> ("Product Development").equals(employee.getDepartment())
                        && ("Male").equals(employee.getGender()))
                .min(Comparator.comparingInt(Employee::getAge)).orElse(new Employee());

        System.out.println(youngestEmployee);
        System.out.println("********* END *********");

        // 11: Who has the most working experience in the organization?
        System.out.println(" 11: Who has the most working experience in the organization?");
        System.out.println("********* START *********");

        Employee mostExperienceEmployee = employeeList
                .stream()
                .min(Comparator.comparingInt(Employee::getYearOfJoining))
                .orElse(new Employee());

        System.out.println(mostExperienceEmployee);
        System.out.println("********* END *********");

        // 12: How many male and female employees are there in the sales and marketing team?
        System.out.println(" How many male and female employees are there in the sales and marketing team? **********");
        System.out.println("********* START *********");

        employeeList
                .stream().filter(employee -> ("Sales And Marketing").equals(employee.getDepartment()))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " employee count: " + v + " in Sales And Marketing Team "));

        System.out.println("********* END *********");

        // 13: What is the average salary of male and female employees?
        System.out.println(" What is the average salary of male and female employees? ************* ");
        System.out.println("********* START *********");
        employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
                .forEach((k, v) -> System.out.println(k + " Employee having average salary : " + v));
        System.out.println("********* END *********");

        // 14: List down the names of all employees ?

        System.out.println(" List down the names of all employees **************");
        System.out.println("********* START *********");
        employeeList.stream()
                .map(employee -> employee.name)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("********* END *********");

        // 15: List down the names of all employees in each department?

        System.out.println(" List down the names of all employees in each department? ***************");
        System.out.println("********* START *********");
        employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((k, v) -> System.out.println(k + " Department and employee are " + v
                        .stream().map(Employee::getName).collect(Collectors.toList())));
        System.out.println("********* END *********");
        // 16: What is the average salary and total salary of the whole organization?

        System.out.println(" What is the average salary and total salary of the whole organization? *************");
        System.out.println("********* START *********");
        System.out.println(employeeList.stream().mapToDouble(Employee::getSalary).sum());
        System.out.println(employeeList.stream().mapToDouble(Employee::getSalary).average().orElseThrow(IOException::new));
        DoubleSummaryStatistics doubleSummaryEmployeeStatistics = employeeList
                .stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println(" Total Salary of Employee in Whole Organization " + doubleSummaryEmployeeStatistics.getSum());
        System.out.println(" Total Count of Employee in Whole Organization " + doubleSummaryEmployeeStatistics.getCount());
        System.out.println(" Average Salary of Employee in Whole Organization " + doubleSummaryEmployeeStatistics.getAverage());
        System.out.println(" Min  of Employee in Whole Organization " + doubleSummaryEmployeeStatistics.getMin());
        System.out.println(" Max of Employee in Whole Organization " + doubleSummaryEmployeeStatistics.getMax());
        System.out.println(doubleSummaryEmployeeStatistics);
        System.out.println("********* END *********");

        // 17: Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.

        System.out.println(" Separate the employees who are younger or equal to 25 years from " +
                "those employees who are older than 25 years. *******************");
        System.out.println("********* START *********");
        employeeList
                .stream()
                .collect(Collectors.partitioningBy(employee -> employee.age > 25))
                .forEach((k, v) -> System.out.println(" Employee greater than 25 " + k + " Employee details " + v));

        System.out.println("********* END *********");
        // 18: Who is the oldest employee in the organization? What is his age and which department he belongs to?

        System.out.println(" Who is the oldest employee in the organization? What is his age and " +
                "which department he belongs to? ****************");
        System.out.println("********* START *********");
        Optional<Employee> employeeDetails = employeeList
                .stream()
                .max(Comparator.comparingInt(Employee::getAge));

        System.out.println(" Oldest Employee: " + employeeDetails);
        System.out.println(" Age: " + employeeDetails.map(Employee::getAge).orElse(0));
        System.out.println(" Department: " + employeeDetails.map(Employee::getDepartment).orElse("No Department"));
        System.out.println("********* END *********");

        // 19 Find Employee with n'th higest salary
        System.out.println(" Employee with n'th Highest Salary ");

        System.out.println("********* START *********");

        /*employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                //.limit(2)
                //.skip(0)
                .collect(Collectors.toList()).forEach(System.out::println);*/

        System.out.println(" Grouping and mapping , which collects name into list" +
                "Key is grouping key an value output of mapping");

        System.out.println(employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary
                        //, Collectors.mapping(Employee::getName, Collectors.toList())
                ))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .findFirst()
                .orElseThrow(NoSuchFieldException::new));
        //.collect(Collectors.toList()).get(0));

        System.out.println(employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary
                        , Collectors.mapping(Employee::getName, Collectors.toList())))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByKey())
                .orElseThrow(NoSuchFieldException::new));

        System.out.println(" Group by salary and value as Whole Object, print name in upper case ");

        System.out.println(employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary))//, TreeMap::new, Collectors.toList()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .map(map -> map.getValue().stream()
                        .map(employee -> new Employee(employee.id, employee.name.toUpperCase()
                                , employee.age, employee.gender, employee.department
                                , employee.yearOfJoining, employee.salary)).collect(Collectors.toList()))
                .collect(Collectors.toList())
                .get(1)
        );

        System.out.println("********* END *********");


        // Employee with salary greather than thrashhold salary

        System.out.println("********* START *********");

        System.out.println(" Employee Salary after certain threshHold ");
        double salaryThreshHold = 25000;
        Set<Employee> empWithSalaryAfterThreshHold = employeeList.stream()
                .filter(emp-> emp.getSalary() > salaryThreshHold)
                .collect(Collectors.toSet());

        empWithSalaryAfterThreshHold.forEach(System.out::println);

        System.out.println("********* END *********");

        // Avg salary after certain thrashhold salary

        System.out.println("********* START *********");

        System.out.println(" Avg Salary after certain threshHold ");
        double avgSalary = employeeList.stream()
                .filter(emp-> emp.getSalary() <salaryThreshHold)
                .collect(Collectors.averagingDouble(Employee::getSalary));

        System.out.println(avgSalary);

        System.out.println("********* END *********");

    }
}
