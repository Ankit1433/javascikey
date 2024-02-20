package assignment9;

class ThreadDemo extends Thread{
    private Thread t;
    private String ThreadName;
    ThreadDemo(String name){
    ThreadName=name;
        System.out.println("creating thread"+ThreadName);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("running"+ThreadName);
        try {
            for (int i=4;i>0;i--){
                System.out.println("thread"+ThreadName+","+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread"+ThreadName+"exiting");
    }
    public void start(){
        System.out.println("starting "+ThreadName);
        if(t==null){
            t=new Thread(this,ThreadName);
            t.start();
        }
    }

}


public class practiceInter {
    public static void main(String[] args) {
        ThreadDemo t1=new ThreadDemo("thread-1");
        t1.start();
        ThreadDemo t2=new ThreadDemo("thread-2");
        t2.start();
    }
}
