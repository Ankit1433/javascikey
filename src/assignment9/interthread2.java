package assignment9;
class Customer{
    int balance=10000;

synchronized void withdraw(int amount){
    System.out.println("going to withdraw");
    if(balance<amount){
        System.out.println("Less Balance!waiting for deposit to withdraw");
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    balance=balance-amount;
    System.out.println("withdraw completed");
}
synchronized void  deposit(int amount){
    System.out.println("going to deposit");
    balance=balance+ 5000;
    System.out.println("deposit completed");
    notify();
}
}
public class interthread2 {
    public static void main(String[] args) throws InterruptedException {
      final   Customer c=new Customer();
        Thread t1=new Thread(()-> c.withdraw(15000));
        Thread t2=new Thread(()-> c.deposit(455));
        t1.start();
        t2.start();
    }
}
