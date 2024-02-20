package assignment7;

public class practice extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(2000);

            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Thread t1=new practice();
        Thread t2=new practice();
        t1.start();
        t2.start();


    }
}
