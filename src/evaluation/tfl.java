package evaluation;

import java.util.concurrent.Semaphore;

 class car extends Thread{
    Semaphore semaphore;
    String ThreadName;
    car(Semaphore semaphore, String ThreadName){
        this.semaphore=semaphore;
        this.ThreadName=ThreadName;
    }

    @Override
    public void run() {
        super.run();
        try {
            System.out.println(ThreadName+"is waiting for turn");
            semaphore.acquire();
            System.out.println(ThreadName+"get turn and running");
            Thread.sleep(1000);
        }
        catch (Exception ignored){}
        finally {
            System.out.println(ThreadName+"finally crossed");
            semaphore.release();
        }
    }
}
public class tfl {
    public static void main(String[] args) {
        Semaphore semaphore=new Semaphore(1);
        car c1=new car(semaphore,"car-1");
        car c2=new car(semaphore,"car-2");
        car c3=new car(semaphore,"car-3");
        c1.start();
        c2.start();
        c3.start();

    }
}
