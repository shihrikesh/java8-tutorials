package classroom;

public class OverloadingTest {

    // primitive would be overloaded first

        public void print(Integer i) {
            System.out.println("Integer");
        }

        public void print(int i) {
            System.out.println("int");
        }

        public void print(long i) {
            System.out.println("long");
        }

        public static void main(String args[]) {
            OverloadingTest test = new OverloadingTest();
            test.print(10);
        }
}
