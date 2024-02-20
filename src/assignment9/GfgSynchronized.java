package assignment9;
class Sender{
    public void send(String msg){
        System.out.println("Sending"+" "+msg);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ignored){}
        System.out.println(msg +"  "+ "sent");
    }
        }


class ThreadSend extends Thread{
    private final String msg;
    final Sender sender;
    ThreadSend(String m,Sender obj){
        msg=m;
        sender=obj;

    }
    public void run(){
        synchronized (sender){
            sender.send(msg);
        }
    }
}
public class GfgSynchronized {
    public static void main(String[] args) throws InterruptedException {
        Sender send=new Sender();
        ThreadSend s1=new ThreadSend("hy",send);
        ThreadSend s2=new ThreadSend("bye",send);
        s1.start();
        s2.start();
        s1.join();
        s2.join();
    }
}
