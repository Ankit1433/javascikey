package assignment7;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * WAP to implement thread pool of size 3 execute 10 thread within that pool,
 * main thread should wait for all the other thread to get terminated.
 */
public class assign7_4 implements Runnable {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            Runnable worker=new assign7_4(""+i);
            executorService.execute(worker);
        }
        executorService.shutdown();
        while(!executorService.isTerminated()){}
        System.out.println("All threads are terminated");
    }
    String message;
   assign7_4(String message){
        this.message =message;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" thread started worker:"+this.message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" thread ended");
    }
}
