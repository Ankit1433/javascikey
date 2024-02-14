
 import java.io.PipedWriter;
 //1.Write a program that creates a two-dimensional array with dimensions of 10×10 and named matrix.
 /*public class day2 {
     public static void main(String[] args) {
         int sum=0;
         System.out.println("hy");
        int matrix[][]={ {0,0,0,0,0,0,0,0,0,0},
                         {0,1,0,0,0,0,0,0,0,0},
                         {0,0,2,0,0,0,0,0,0,0},
                         {0,0,0,3,0,0,0,0,0,0},
                         {0,0,0,0,4,0,0,0,0,0},
                         {0,0,0,0,0,5,0,0,0,0},
                         {0,0,0,0,0,0,6,0,0,0},
                         {0,0,0,0,0,0,0,7,0,0},
                         {0,0,0,0,0,0,0,0,8,0},
                         {0,0,0,0,0,0,0,0,0,9}
                 };
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                if(i==j){
                    sum=sum+matrix[i][j];
                }
            }
        }
         System.out.println("sum of diagonal elements is"+sum);

     }
     }
*/
// 2.Java program to find whether the given number is ArmStrongNumber or not
/*
 public class day2 {
     public static void main(String[] args) {
         int n=153,power=String.valueOf(n).length();
         int reversed=n,sum=0,temp=0;
         while(n>0){
             temp=n%10;
             sum= (int) (sum+Math.pow(temp,power));
             n=n/10;
         }


         if (sum != reversed) {
             System.out.println("not armstrong");
         } else {
             System.out.println("armstrong");
         }
     }
 }*/




/*3.•A left rotation operation on an array of size n,
 shifts each of the array's elements 1 unit to the left.
 Given an integer d, rotate the array that many steps left and return the result.
import java.util.*;
 public class day2  {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many steps you have to rotate by:");
        int d= sc.nextInt();

        for (int k=0;k<d;k++){
           LeftRotateByOne(arr);
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
   static void LeftRotateByOne(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i-1];
            arr[i-1]=arr[i];
            arr[i]=temp;
        }

    }
}
*/


/*
Calculate BMI Using Java
public class day2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("please enter your weight(in pounds) to calculate BMI of your Body");
        float weight=sc.nextFloat();

        System.out.println("please enter your height(in inches) to calculate BMI of your Body");
        float height=sc.nextFloat();
        float ResultantHeight=height*height;
        float BMI=(weight/ResultantHeight)*703;

        System.out.println("your BMI index is:"+String.format("%.2f",BMI));
        if(BMI<=16.00)
            System.out.println("Starvation");
        else if(BMI>=16.00 && BMI<=16.99)
            System.out.println("emaciation");
        else if(BMI>=17.00 && BMI<=18.49)
            System.out.println("underweight");
        else if(BMI>=18.50 && BMI<=22.99)
            System.out.println("normal,low range");
        else if(BMI>=23.00 && BMI<24.99)
            System.out.println("normal,high range");
        else if(BMI>=25.00 && BMI<27.49)
            System.out.println("overweight low range");
        else if(BMI>=27.50 && BMI<29.99)
            System.out.println("overweight high range");
        else if(BMI>=30.00 && BMI<34.99)
            System.out.println("1st degree obesity");
        else if(BMI>=35.00 && BMI<39.99)
            System.out.println("2nd degree obesity");
        else {
            System.out.println("3rd degree obesity");
        }


    }
}
/*
/*

public class day2 {
    public static void main(String[] args) {
        int a='A';
        int f='L';
        final int lenFA=(f-a);
        int count=1;
        for (int i = 0; i <= lenFA; i++) {
            for(int j=lenFA;j>i;j--){
                System.out.print(" ");
            }
            System.out.print((char)(a+i));

           if(i>0) {
               System.out.print(" ".repeat(count));
               count += 2;
           }



            if(i>0)System.out.print((char)(a+i));
            System.out.print("\n");
        }
        count -= 4;
        for (int i = lenFA-1; i >=0; i--) {
            for(int j = lenFA; j > i; j--){
                System.out.print(" ");
            }
            System.out.print((char)(a+i));
            if(i<lenFA && count>0) {
                System.out.print(" ".repeat(count));
                count -= 2;
            }
            if(i>0)System.out.print((char)(a+i));
            System.out.print("\n");

        }
    }
}


*/
/*
public class day2 {
    public static void main(String[] args) {
        int number=5;
        for(int i=1;i<=number;i++){
            for(int j=(number);j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for (int i=number;i>1;i--){
            for(int j=i;j<=number;j++){
                System.out.print(" ");
            }
            for(int j=i;j>1;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}*/