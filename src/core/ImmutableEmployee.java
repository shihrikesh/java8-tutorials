package core;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableEmployee {
    private final String empId;
    private final String empName;
    // using list but with immutable object String, below don't need deep copy
    private final List<String> tokens;

    public ImmutableEmployee(String empId, String empName, List<String> tokens) {
        this.empId = empId;
        this.empName = empName;
        this.tokens = tokens;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "ImmutableEmployee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", tokens=" + tokens +
                '}';
    }

    public List<String> getTokens() {
        return new ArrayList<>(tokens);
    }
}
