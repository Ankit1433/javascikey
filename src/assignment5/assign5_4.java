import java.util.Scanner;

public class assign5_4 {
    double salary;
    double fixedamount=50000;
    double tax;
     void calculateIncomeTax(double salary){

    if(salary==fixedamount){
        tax=0;
        System.out.println("income tax to be paid is :"+tax);
    } else if (salary>50000&&salary<=60000) {
        tax=(salary-fixedamount)*0.1;
        System.out.println("income tax to be paid is :"+tax);

    }
    else if ( salary>60000 && salary<=150000) {
        tax=(salary-fixedamount)*0.2;
        System.out.println("income tax to be paid is :"+tax);

    }
    else{
        tax=(salary-fixedamount)*0.3;
        System.out.println("income tax to be paid is :"+tax);

    }

    }


    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("enter your salary to find how much tax you have to pay!");
        Scanner sc =new Scanner(System.in);
        double salary= sc.nextDouble();
        assign5_4 obj=new assign5_4();
        obj.calculateIncomeTax(salary);
    }

}
