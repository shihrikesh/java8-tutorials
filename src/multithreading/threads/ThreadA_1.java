package multithreading.threads;

public class ThreadA_1 {

    /**
     * Thread Priority
     * min_priority = 1
     * Mac_Priority =10
     * NORM_PRIORITY 5
     *
     * all thread have norm_priority even main thread
     * but main is excetion and would be run first even setting another thread with highest priority
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {

        Runnable run1 = ()-> {
            for(int i=0;i<5;i++){
                System.out.println(" Running thread0 "+i);
            }
        };

        Runnable run2 = ()-> {
            for(int i=0;i<5;i++){
                System.out.println(" Running thread1 "+i);
            }
        };

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);

        t1.start();
        t2.start();

        // Thread may run in any order as per cpu scheduler
        t1.join();
        t2.join();


    }
}
