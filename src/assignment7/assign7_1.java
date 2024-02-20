package assignment7;
//Program to implement thread using runnable interface
public class assign7_1 implements Runnable{
    @Override
    public void run() {
        System.out.println("thread running using runnable");
    }

    public static void main(String[] args) {
        Runnable t2=new assign7_2();
        Thread t1=new Thread(t2,"ankit");
        t1.start();
        /* t1.run(); */
    }
}
