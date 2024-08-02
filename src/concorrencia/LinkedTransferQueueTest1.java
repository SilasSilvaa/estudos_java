package concorrencia;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest1 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Test"));
        System.out.println(tq.offer("Test"));
        System.out.println(tq.offer("Test", 10, TimeUnit.SECONDS));
        tq.put("Test2");
        if(tq.hasWaitingConsumer()){
            tq.transfer("Test2");
        }
        System.out.println(tq.tryTransfer("Test3"));
        System.out.println(tq.tryTransfer("Test3", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
