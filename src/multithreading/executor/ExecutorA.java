package multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorA {

    public static void main(String[] args) {


        System.out.println(" Single Thread by Executor Service ");
        try(ExecutorService service = Executors.newSingleThreadExecutor()){

            for (int i=0;i<10;i++){
                service.execute(new Worker(i));
            }
        }

        System.out.println(" Fixed Thread by Executor Service ");
        try(ExecutorService service1 = Executors.newFixedThreadPool(2)){

            for (int i=0;i<10;i++){
                service1.execute(new Worker(i));
            }
        }

        System.out.println(" Cached Thread by Executor Service ");
        try(ExecutorService service1 = Executors.newCachedThreadPool()){

            for (int i=0;i<10;i++){
                service1.execute(new Worker(i));
            }
        }


    }
}
