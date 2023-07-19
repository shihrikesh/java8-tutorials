package lambda;

import java.util.function.Predicate;

public class FunctionalTesting {

    /**
     *
     * Functional Interface in JAVA 8
     * Predicate test()
     * Function apply()
     * Consumer accept()
     * Producer get()
     * @param args
     */
    public static void main(String[] args) {
        Predicate<String> predicate = str-> str.startsWith("h");
        System.out.println(predicate.test("hrishikesh"));
    }
}
