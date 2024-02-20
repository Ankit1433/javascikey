package assignment7;
//WAP to execute 2 thread with the time gap of 1 second.
// (given that main thread should not wait for above thread to execute)

public class assign7_5 extends Thread{
    public void run(){
        try {
            System.out.println("thread running"+getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) throws InterruptedException {

        assign7_5 t1= new assign7_5();

        assign7_5 t2=new assign7_5();
        System.out.println("hy");
        t1.start();
        Thread.sleep(1000);
        t2.start();
    }

}
