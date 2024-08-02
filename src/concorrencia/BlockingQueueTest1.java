package concorrencia;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest1 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Test");
        System.out.printf("%s Added value to %s%n", Thread.currentThread().getName(), bq.peek());

        System.out.println("Trying to add another value");
        new Thread(new RemoveFromQueue(bq)).start();
        bq.put("Test 2");
        System.out.printf("%s Added the value %s%n", Thread.currentThread().getName(), bq.peek());
    }

    static class RemoveFromQueue implements Runnable {
        private final BlockingQueue<String> bq;

        RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s Going to sleep for 5s %n", Thread.currentThread().getName());

            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.printf("%s removing value form queue %s%n", Thread.currentThread().getName(), bq.take());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
