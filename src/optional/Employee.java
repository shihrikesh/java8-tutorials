package optional;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

class Department{

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Department(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Employee {

    private String name;
    private Department department;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                '}';
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee(String name, Department department){
        this.name = name;
        this.department = department;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("hrishi", new Department("BRD")));
        employeeList.add(new Employee("shikha", new Department("BRD")));
        employeeList.add(new Employee("dennis", new Department("BRD")));
        employeeList.add(new Employee("ashwin", null));
        employeeList.add(null);

        employeeList.forEach(System.out::println);
        Optional<List<Employee>> optionalEmployee = Optional.of(employeeList);
        Consumer<Department> departmentConsumer = t-> System.out.println(t);
        //employeeList.stream().map(Optional::ofNullable).filter(employee -> employee.ifPresent(employee1 -> Optional.ofNullable(employee1)));
        System.out.println(optionalEmployee);
       // employeeList.stream().filter(employee -> employee.department == null).collect(Collectors.toList());
        optionalEmployee.ifPresent(System.out::println);
        employeeList.stream().filter(employee -> employee.department != null).forEach(System.out::println);
    }
}
