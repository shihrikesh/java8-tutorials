package multithreading.lock;

public class TestLock {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Runnable run =()->{
            System.out.println(Thread.currentThread().getName() +" Withdrawing amount ");
            try {
                bankAccount.withDraw(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        t1.start();
        t2.start();
        t3.start();
    }
}
