package multithreading.executor;

public class Worker1 implements Runnable{
    /**
     * Runs this operation.
     */

    private int task;

    @Override
    public void run() {
        System.out.println("Running Schedule "+ task +" ms");
        task+=2000;

        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
    }
}
