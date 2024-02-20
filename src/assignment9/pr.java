package assignment9;
class Counter1{
    int count;
  synchronized   public void increment(){

        count++;
    }
}
public class pr {


    public static void main(String[] args) throws InterruptedException {
        Counter1 c=new Counter1();
        Runnable obj1=()->{

            for (int i=1;i<=10000;i++){
                c.increment();

            }

        };


        Runnable obj2=()->{

            for (int i=1;i<=10000;i++){
                c.increment();

            }

        };
        Thread t1=new Thread(obj1);

        Thread t2=new Thread(obj2);

            t1.start();
            t2.start();
            t1.join();
            t2.join();
        System.out.println(c.count);



    }
}
