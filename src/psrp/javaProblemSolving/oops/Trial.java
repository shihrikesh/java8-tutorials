package psrp.javaProblemSolving.oops;

public class Trial {
    int i=10;
    Trial() {
        System.out.println("Constructor");
    }

    public static void print() {
        System.out.println("Static Method");
    }

    {
        System.out.println("Instance Block");
    }

    static {
        System.out.println("Static Block");
    }


    public void InstanceMethod() {
        System.out.println("Instance Method");
    }

    public static void main(String[] args) {

        Trial execu = new Trial();
        System.out.println("now method call ------");
        execu.InstanceMethod();

    }
}