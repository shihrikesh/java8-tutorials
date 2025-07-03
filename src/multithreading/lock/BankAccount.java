package multithreading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance =100;
    private final Lock lock = new ReentrantLock();

    public void withDraw(int amount) throws InterruptedException {
        try {
           // if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
            lock.lock();
                if (balance >= amount) {
                    Thread.sleep(2000);
                    try {
                        balance = balance - amount;
                        System.out.println(Thread.currentThread().getName() +" Balance Amount" + balance);
                    } catch (Exception ex){
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("Insufficient Balance!! ");
                }
          //  } else {
          //      System.out.println(Thread.currentThread().getName()+" Could Not Acquire the Lock");
          //  }
        } catch (Exception ex){
            Thread.currentThread().interrupt();
        }

    }
}
