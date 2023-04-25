package mockTest4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsTest {
    public static void main(String[] args) throws IOException {
        StreamsTest streamsTest = new StreamsTest();
        streamsTest.solution();

    }


    private void solution() throws IOException {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("AAA", 111, "D1", 1000));
        employees.add(new Employee("BBB", 222, null, 2000));
        employees.add(new Employee("CCC", 333, "D2", 3000));
        employees.add(new Employee("DDD", 444, "D3", 4000));
        employees.add(new Employee("EEE", 555, "D2", 5000));
        employees.add(new Employee("FFF", 666, "D2", 6000));


        System.out.println(employees);
        //TODO print/get employee names belong to dept "D2" - using streams functions

        Map<String, List<Employee>> employeeList = employees.stream().filter(employee -> "D2".equals(employee.deptno))
                .collect(Collectors.groupingBy(employee -> employee.deptno));
        employeeList.forEach((s, employees1) -> System.out.println("dept"+ s +" Employee" + employees1));



        //TODO calculate and print the sun of all employees salaries using streams- 21000

        Integer sumSalary = employees.stream().map(Employee::getSalary).reduce(0, Integer::sum);
        System.out.println("Finding total sum of salaries Sum function " + sumSalary);

        System.out.println(employees.stream().collect(Collectors.summingInt(Employee::getSalary)));

        int mapSumSalary = employees.stream().map(Employee::getSalary)
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("mapToInt function for total sum " + mapSumSalary);

        int mapIntSalary = employees.stream().mapToInt(Employee::getSalary).sum();
        System.out.println("mapToInt function for total sum " + mapIntSalary);

        Integer maxSalary = employees.stream().map(Employee::getSalary).reduce(0,Integer::max);
        System.out.println("finding Max value of salary " +maxSalary);
        //
        //
        // TestFunction func = ()

        // Write below program into java8
      /*  If(emp==null){

            Throw new SomeExceptiono();

        }else{

            processEmp(emp)

        }*/
        Employee employee =  new Employee("FFF", 666, "D2", 6000);
        Optional<Employee> optionalEmployee = Optional.ofNullable(employee);
        Employee employee1 = optionalEmployee.orElseThrow(IOException::new);

         //   Test Predicate
         //   apply()  Functions
        //    accepts  Consumer
        //    get()    Supplier

                  //  findFirst
                 //   findAny
    }


    private class Employee {


        private String name;
        private int id;
        private String deptno;
        private int salary;


        public Employee(String name, int id, String deptno, int salary) {
            this.name = name;
            this.id = id;
            this.deptno = deptno;
            this.salary = salary;
        }


        @Override
        public String toString() {
            return name + "::" + id + "::" + deptno + "::" + salary;
        }


        public String getName() {
            return name;
        }


        public int getId() {
            return id;
        }


        public String getDeptno() {
            return deptno;
        }


        public int getSalary() {
            return salary;
        }


    }
}