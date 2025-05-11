package multithreading.executor;

public class Worker implements Runnable{
    /**
     * Runs this operation.
     */

    private int task;

    public Worker(int task){
        this.task = task;
    }
    @Override
    public void run() {
        System.out.println("Task "+ task +" is Executed by" + Thread.currentThread().getName());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
