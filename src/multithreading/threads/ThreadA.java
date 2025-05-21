package multithreading.threads;

public class ThreadA {

    public static void main(String[] args) throws InterruptedException {
        Thread task1 = new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Task1 "+i);
            }
        });

        Thread task2 = new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Task2 "+i);
            }
        });

        Runnable runnable = ()->{
            for(int i=0;i<5;i++){
                System.out.println("Task3 "+i);
            }
        };

        Thread task3 = new Thread(runnable);

        // comment join and see, first main thread would be called, then thrad1 and thread2 later
        // main thread have highest priority
        task1.start();
        task1.join();  // jvm prioritise thread over main thread

        task2.start();
        task2.join(2000);

        //Runnable thread, running va passing into thread
        task3.start();
        task3.join();



        System.out.println(" SC_A thread ");
    }
}
