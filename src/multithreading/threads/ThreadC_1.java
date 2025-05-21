package multithreading.threads;

public class ThreadC_1 {

    /**
     *  Race condition, below code will provide inconsistent result ,
     *  since shared resource would be changes quickly by other threads
     *
     *  solution using synchronized method
     *
     *  but it has draw back, as method will be locked until on thread oes not releases
     *  all synchronized method will be blocked if any one is called
     *   method and calling parent method would also need to be synchronized
     *
     *  solution is to have synchronized block of code
     *
     */
    public static int counter=0;
    // using below for LOCK in synchronised block
    public static final Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        Runnable run1 = ()->{
          for(int i=0;i<10000;i++){
              // uncomment and increase counter in this method
              // instead of increasing from synchronized method
              //counter++;
              increment();
            }
        };

        Runnable run2 = ()->{
            for(int i=0;i<10000;i++){
                //counter++;
                increment();
            }
        };

        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("counter " + counter);
    }

    /*public static synchronized void increment(){
        counter++;
    }*/

    // better approach
    // using custom object lock, only blocking few lines of code rather than whole method
    // this way child class does not need to use synchronized keyword
    public static void increment(){
        synchronized(lock) {
            counter++;
        }

    }
}
