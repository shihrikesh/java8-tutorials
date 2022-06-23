package lambda;

import java.util.function.BiFunction;

@FunctionalInterface
interface MethodReferencingInterface {
    Student getEmployee(String name);
}

public class Lambda2 {
/*
 Functional Interface to call constructor with multiple parameter
 https://www.codementor.io/@eh3rrera/using-java-8-method-reference-du10866vx

 */


    public static void main(String[] args) {
        MethodReferencingInterface mfi = Student::new;
        Student student = mfi.getEmployee("hrishi");
        System.out.println("args = " + student.getName());

        BiFunction<String, Integer, Student> mf1 = Student::new;
        Student student1 = mf1.apply("tom", 123);
        System.out.println("args = " + student1);

    }
}
