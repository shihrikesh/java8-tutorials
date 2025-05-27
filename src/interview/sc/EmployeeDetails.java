package interview.sc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDetails {


    public List<String> filterEmployeeBasedOnSalary(List<Employee> employeeList){
        List<String> list = employeeList.stream().sorted(Comparator.comparingDouble(Employee::salary).reversed()).limit(3).map(Employee::name).toList();

       // employeeList.stream().filter(emp-> emp.salary()==maxSalary).map(Employee::name).toList();

        return list;
    }

    public Map<String, Double> averageEmpSalary(List<Employee> employeeList){
        Map<String, Double> avgSalary = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::department, Collectors.averagingDouble(Employee::salary)));

        return avgSalary;
    }

    public static void main(String[] args) {

        Employee amol  = new Employee("Amol","SC",50.00);
        Employee abhiram  = new Employee("Abhiram","SC-Risk",50.00);
        Employee shrinath  = new Employee("Shrinath","JPMC",40.00);
        Employee vishal  = new Employee("Vishal","Stanely",50.00);
        Employee kaml  = new Employee("Kamal","SC",50.00);
        Employee rishi  = new Employee("Rishi","DBS",60.00);
        Employee shri  = new Employee("Shrinath","SC",80.00);



        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(rishi);
        employeeList.add(amol);
        employeeList.add(abhiram);
        employeeList.add(shri);
        employeeList.add(vishal);
        employeeList.add(shrinath);



        EmployeeFI employeeFI = (list)-> list.stream()
                .sorted(Comparator.comparingDouble(Employee::salary).reversed())
                .map(Employee::name)
                .limit(3)
                .toList();



       // System.out.println(employeeFI.filterEmployee(employeeList));

       // System.out.println(employeeFI.averageEmpSalary(employeeList));

        // first salary then sort by name

       // EmployeeFI sortBySalaryName = list -> list.stream().

        EmployeeFI sortBySalaryName = (list)-> list.stream()
                .sorted(Comparator.comparingDouble(Employee::salary).reversed())
                     //   .thenComparing(Employee::name))
                .map(Employee::name)
                //.map(Employee::salary)
                .limit(3)
                .toList();



        System.out.println(sortBySalaryName.filterEmployee(employeeList));

       List<Employee> samlaryList= employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::salary).reversed())
                .toList();
       int rank=1;
       int preRank=0;

        System.out.println(samlaryList.stream().map(Employee::salary).toList());

       Double previousSal=0.0;
       for(Employee emp: samlaryList){
           if(emp.salary().equals(previousSal)){
               System.out.println("Name: "+emp.name()+" Rank: "+ preRank);
               previousSal= emp.salary();
               rank++;

           } else {
               System.out.println(" Name: "+emp.name()+" Rank: "+ rank);
               previousSal= emp.salary();
               preRank=rank;
               rank++;
           }

           System.out.println();
       }


        // ranking 100,100,90,90,80,70
        // 1,1,3,3,5,6
        // skip n rank if already n people got it

        // descending

    }



}
