package oops;

public class Child implements Parent {


    public Child(){
        display();
    }
    @Override
    public void get() {
        System.out.println(" Abstract method implemented in child");
    }

    public static void display(){
        System.out.println(" child static method");
    }
}
