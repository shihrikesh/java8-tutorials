package oops;

import java.io.IOException;

public class Child implements Parent {


    public Child(){
        display();
    }
    @Override
    public Integer get() throws NullPointerException {
        // same or covariant return type can be specified
        // if Parent is throwing checked Exception then
        // only same or child exception can be thrown by overridden methods
        // scope can be broadened
        // If Parent is not throwing any exception, child can throw any unchecked exception
        System.out.println(" Abstract method implemented in child");
        return 23;
    }

    public static void display(){
        System.out.println(" child static method");
    }
}
