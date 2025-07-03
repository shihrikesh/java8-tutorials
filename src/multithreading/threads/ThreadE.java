package multithreading.threads;

public class ThreadE {

    /**
     *  wait and notify in action using consumer and producer scenario
     *
     */
    // using below for LOCK in synchronised block

    public static void main(String[] args) throws InterruptedException {

        Worker work = new Worker(5, 0); // one shared container

        Runnable run1 = ()->{
            try {
                work.producer();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable run2 = ()->{
                try {
                    work.consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        };

        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);
        thread1.start();
        thread2.start();

    }


}
