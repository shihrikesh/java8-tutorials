package multithreading.synchronizedCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SC_A {
    /**
     * Synchronised Collection,
     * can be used in multi thread env,
     *
     * normal collection may cause race condition and abnormal result
     * where SynchronisedCollection help to resolve this
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        List<Integer> l = Collections.synchronizedList(new ArrayList<>());
        //List<Integer> l = new ArrayList<>();
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                l.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                l.add(i);
            }
        });
        t.start();
        t2.start();
        t.join();
        t2.join();
        System.out.println("List size: " + l.size());
    }
}