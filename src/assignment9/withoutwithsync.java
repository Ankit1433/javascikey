package assignment9;
class Table{
   synchronized void printable(int n){
        for (int i=1;i<5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
        }
 // without sync
//void printable(int n){
//    for (int i=1;i<5;i++){
//        System.out.println(n*i);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
//        }


public class withoutwithsync {
    public static void main(String[] args) {
        Table t=new Table();
      Thread t1=new Thread(() -> t.printable(5));

        Thread t2=new Thread(() -> t.printable(7));
        t1.start();
        t2.start();
    }
}
