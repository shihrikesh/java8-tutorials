package multithreading.threads;

public class ThreadB_1 {

    /**
     * Thread Priority
     * min_priority = 1
     * Mac_Priority =10
     * NORM_PRIORITY 5
     *
     * all thread have norm_priority even main thread
     * but main is exception and would be run first even setting another thread with highest priority
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
        System.out.println("Thread Name: "+ t1.getName() + "Priority "+t1.getPriority());
        System.out.println("Thread Name: "+ t2.getName() + "Priority "+t2.getPriority());
        System.out.println(Thread.currentThread().getPriority());

        t1.start();
        // based on priority thread scheduler will allocate CPU time to threads
        t1.setPriority(3);

        t2.start();
        t2.setPriority(2);

        System.out.println("Thread Name: "+ t1.getName() + "Priority "+t1.getPriority());
        System.out.println("Thread Name: "+ t2.getName() + "Priority "+t2.getPriority());


        // Thread may run in any order as per cpu scheduler but based on priority highest would run first
        t1.join();
        t2.join();


    }
}
