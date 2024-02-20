package assignment9;

import java.util.Arrays;

class chat {
    boolean flag = false;

    synchronized void Publisher(String msg) {
        if (flag) {
            try {

                wait();
                Thread.sleep(2000);
            } catch (InterruptedException ignored) {

            }
        }
        System.out.println(msg);
        flag = true;
        notify();
    }


    synchronized void Subscriber(String msg) {
        if(!flag) {
            try {
                wait();
                Thread.sleep(2000);
            } catch (InterruptedException ignored) {

            }
        }
            System.out.println(msg);
            flag=false;
            notify();
        }
    }

public class interTread3  {
    public static void main(String[] args) throws InterruptedException {
        chat c=new chat();
        Thread t1=new Thread(()->{
            String[] s1= { "Hi", "How are you ?", "I am also doing fine!" };
            Arrays.stream(s1).forEach(c::Publisher);

        });




        Thread t2=new Thread(()->{
            String[] s2= {"Hi", "I am good, what about you?", "Great!" };

            for (String s : s2) {
                c.Subscriber(s);
            }
        });
        t1.start();
        Thread.sleep(3000);
        t2.start();
    }
}
