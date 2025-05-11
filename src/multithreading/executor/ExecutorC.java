package multithreading.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorC {

    /**
     *  Callable and Future
     *
     *
     */


    public static void main(String[] args) {

        Callable<Integer> callable =()->{
          Thread.sleep(5000);
            return 12;
        };

        try(ExecutorService service = Executors.newFixedThreadPool(2)) {
            Future<Integer> future = service.submit(callable);
            System.out.println(future.get(6, TimeUnit.SECONDS));
            System.out.println("SC_A thread execution completed!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
