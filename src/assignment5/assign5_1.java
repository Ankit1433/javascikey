import java.util.Scanner;

public class assign5_1 extends Bank {

    public static void main(String[] args) {
        int op;
        System.out.println("hy");

        Scanner sc = new Scanner(System.in);
            assign5_1 obj = new assign5_1();
        do {
            System.out.println("what you have to do today");

            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Show Balance");
            System.out.println("4. exit");
            op = sc.nextInt();
            switch (op) {

                case 1:
                    System.out.println("enter the amount you want to deposit");
                    float depositAmount = sc.nextFloat();
                    obj.deposit(depositAmount);
                    System.out.println("amount deposited successfully!");
                    break;
                case 2:
                    System.out.println("enter the amount you want to withdraw");
                    float withdrawAmount = sc.nextFloat();
                    obj.withdraw(withdrawAmount);
                    System.out.println("amount withdrawn successfully");
                    break;
                case 3:
                    System.out.println("your account balance is");
                    System.out.println(obj.display());
                    break;
                case 4:
                    System.out.println("bye");
                    return;
                default:
                    System.out.println("invalid choice ! please select again");
            }
        } while (op != 4);
    }
}
class Bank{
   private int accNo;
   private String name;
   private float balance;

   public void deposit(float amount){
        this.balance+=amount;
    }
   public void withdraw(float amount){
        if(amount<=balance){
            this.balance = balance - amount;
            System.out.println("your remaining balance is:"+balance);
        }
        else {
            System.out.println("insufficient Balance");
        }
    }
   public float display(){
        return balance;
    }

}