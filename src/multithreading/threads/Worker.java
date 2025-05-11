package multithreading.threads;

import java.util.ArrayList;
import java.util.List;

public class Worker{

        static int s=0;
        private static int top;
        private static int bottom;
        private static List<Integer> list = new ArrayList<>();
        public static final Object LOCK = new Object();

        public Worker(int top, int bottom) {
            Worker.top = top;
            Worker.bottom = bottom;
        }

        public void producer() throws InterruptedException {
            synchronized (LOCK) {
                while (true) {
                    if (list.size() == top) {
                        System.out.println("Container full... Passing from Producer to Consumer");
                        LOCK.wait();
                    } else {
                        System.out.println(s+ "adding into container!!");
                        list.add(s++);
                        LOCK.notify();
                    }
                    Thread.sleep(1000);
                }
            }
        }

        public void consumer() throws InterruptedException {
            synchronized (LOCK) {
                while (true) {
                    if (list.size() == bottom) {
                        System.out.println("Container Empty... Passing from Consumer to Producer");
                        LOCK.wait();
                    } else {
                        System.out.println(s--+ " adding into container!!");
                        list.removeLast();
                        LOCK.notify();
                    }
                    Thread.sleep(1000);
                }
            }
        }
    }