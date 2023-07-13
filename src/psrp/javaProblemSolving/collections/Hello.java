package psrp.javaProblemSolving.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Hello<T> {
    T t;

    public Hello(T t) {
        this.t = t;
    }

    public String toString() {
        return t.toString();
    }

    public static void main(String[] args) {
        System.out.print(new Hello<String>("hi"));
        System.out.print(new Hello("there"));

        Set<Number> numbers = new HashSet<>();
        numbers.add(new Integer(86));
        numbers.add(75);
        numbers.add(new Integer(86));
        numbers.add(null);
        numbers.add(309L);
        Iterator iter = numbers.iterator();
        while (iter.hasNext())
        System.out.print(iter.next());

        TreeSet<String> tree = new TreeSet<String>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree.ceiling("On"));
        System.out.println(tree);
    }
}