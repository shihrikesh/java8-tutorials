package multithreading.lock;

public class TestReadWriteLock {

    public static void main(String[] args) throws InterruptedException {
        ReadWriteCounter counter = new ReadWriteCounter();
        Runnable readTask = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() +
                        " read: " + counter.getCount());
            }
        };
        Runnable writeTask = () -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
                System.out.println(Thread.currentThread().getName() +
                        " incremented");
            }
        };
        Thread writerThread = new Thread(writeTask);
        Thread readerThread1 = new Thread(readTask);
        Thread readerThread2 = new Thread(readTask);
        writerThread.start();
        readerThread1.start();
        readerThread2.start();
        writerThread.join();
        readerThread1.join();
        readerThread2.join();
        System.out.println("Final count: " + counter.getCount());
    }
}
