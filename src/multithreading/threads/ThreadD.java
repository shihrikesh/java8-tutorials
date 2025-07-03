package multithreading.threads;

public class ThreadD {

    /**
     *  wait and notify
     *
     */
    // using below for LOCK in synchronised block
    public static final Object LOCK = new Object();
    public static void main(String[] args) throws InterruptedException {
        Runnable run1 = ()->{
            try {
                one();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable run2 = ()->{
                //counter++;
                try {
                    two();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        };

        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);
        thread1.start();
        thread2.start();

    }

    public static void one() throws InterruptedException {
        synchronized(LOCK) {
            System.out.println("Thread 1 before wait!!! ");
            LOCK.wait();
            System.out.println("Thread 1 after wait!!! ");
        }

    }

    public static void two() throws InterruptedException{
        synchronized(LOCK) {
            System.out.println("Thread 2 before notify!!! ");
            LOCK.notify();
            System.out.println("Thread 2 after notify!!! ");
        }

    }
}
