package multithreading.threads;

public class ThreadB {

    /**
     * Running Demon thread and user thread, to see,
     * JVM terminate daemon thread after no program remains to run
     * @param args
     */
    public static void main(String[] args) {

        Runnable daemonRun =()->{

            int count=0;
            while(count<500){

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Demon Thread Running!!!! ");
                count++;
            }

        };

        Runnable userRun=()->{
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("User Thread Running!!!! ");
        };

        Thread daemonThread = new Thread(daemonRun);
        Thread userThread = new Thread(userRun);

        // set Daemon  to true , make it demon thread,
        // meaning this daemon thread will run until all program finish
        daemonThread.setDaemon(true);

        daemonThread.start();
        userThread.start();

    }

}
