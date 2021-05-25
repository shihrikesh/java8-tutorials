package sorting;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
// Default sorting using Comparable
public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private long salary;

    @Override
    public int compareTo(Employee o) {
        return this.id - o.getId();
    }
}
