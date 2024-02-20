package assignment7;
//Program to creating multiple thread
public class assign7_3 extends Thread{
    @Override
    public void run() {
        super.run();

        System.out.println("thread running: "+getName());
    }

    public static void main(String[] args) {
        assign7_3 t1=new assign7_3(){};
        assign7_3 t2=new assign7_3(){};
        assign7_3 t3=new assign7_3(){};
        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");
        t1.start();
        t2.start();
        t3.start();


    }
}
