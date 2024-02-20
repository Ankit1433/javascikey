package assignment7;
//Write a program to create thread using Thread class.
public class assign7_2 extends Thread{
    @Override
    public void run() {
        System.out.println("hy");
        System.out.println("thread running using thread class");
    }

    public static void main(String[] args) {
        assign7_2 t1=new assign7_2();
        t1.start();
    }
}
