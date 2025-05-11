package multithreading.executor;

import java.util.concurrent.Callable;

class ReturnValueTask implements Callable<Integer> {

    public Integer call() throws Exception {
        Thread.sleep(5000);
        return 12;
    }
}