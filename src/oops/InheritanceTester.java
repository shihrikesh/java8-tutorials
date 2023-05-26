package oops;

public class InheritanceTester {

    // https://www.java67.com/2012/08/can-we-override-static-method-in-java.html

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.get();
        //obj.display();  // method hiding, calling parent class display method
    }
}
