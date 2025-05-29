package jdk21;

import java.util.concurrent.Executors;

public class AyncFuture {

    public static void main(String[] args) {

        try(var executor = Executors
                .newFixedThreadPool(Runtime.getRuntime().availableProcessors())){
            var future = executor.submit(()-> System.out.println("Hello, world"));
            Thread.sleep(100);

            var result= switch (future.state()){
                case CANCELLED,FAILED -> throw new IllegalStateException(" Could not execute");
                case SUCCESS -> future.resultNow();
                default -> null;
            };

            System.out.println(result);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
