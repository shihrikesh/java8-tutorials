package multithreading.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorB {

    /**
     *  Scheduled Executor Service
     *
     *  Created thread pool and run one task for specific time schedule
     *  if task exceed the time, task can be terminated
     */


    public static void main(String[] args) {

        try(ScheduledExecutorService service = Executors.newScheduledThreadPool(1)){
            service.scheduleAtFixedRate(new Worker1() ,0,2000, TimeUnit.MILLISECONDS);
            if(!service.awaitTermination(10000,TimeUnit.MILLISECONDS)){
                service.shutdown();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
