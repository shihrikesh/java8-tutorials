package interview.sc;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@FunctionalInterface
public interface EmployeeFI {

    List<String> filterEmployee(List<Employee> list);

    default Map<String, Double> averageEmpSalary(List<Employee> employeeList){
        Map<String, Double> avgSalary = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::department, Collectors.averagingDouble(Employee::salary)));

        return avgSalary;
    }

}
