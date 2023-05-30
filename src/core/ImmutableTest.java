package core;

import java.util.ArrayList;
import java.util.List;

public class ImmutableTest {

    public static void main(String[] args) {
        Age age = new Age("1","9", "1992");
        ImmutableStudent student = new ImmutableStudent(1,"hrishi", age);
        System.out.println(" Before Age object modified " + student.getAge().getYear());
        age.setYear("1993");  // when no cloning at parameterized constructor
        student.getAge().setYear("1993");  // when no handling cloning at getter for mutable object in immutable class
        System.out.println(" Before Age object modified " + student.getAge().getYear());

        List<String> token = new ArrayList<>();
        token.add("hello");
        ImmutableEmployee employee = new ImmutableEmployee("1", "hrishi", token );
        employee.getTokens().add("hello again");  // no effect still immutable
        System.out.println(employee);
    }

}
