package psrp.javaProblemSolving.oops;

public abstract class Bird {
    // below example, method hiding for private and static methods
 private void fly() { System.out.println("Bird is flying"); }
 public static void main(String[] args) {
 Bird bird = new Pelican(); // object created with child but reference by parent
 bird.fly();  // parent method would be called, method hiding works
 }
 }
 class Pelican extends Bird {
 protected void fly() { System.out.println("Pelican is flying"); }
 }