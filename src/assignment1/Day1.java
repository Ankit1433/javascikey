import java.util.Scanner;
/*

public class Day1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 4, 3, 2, 1, 5, 5, 4, 2, 7, 3, 5};
        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println("Count of " + arr[i - 1] + " is " + count);
                count = 1;
            }
        }
        System.out.println("Count of " + arr[arr.length - 1] + " is " + count);
    }
}
4.Take input of 2 binary number and Write function to find sum for the same
public class Day1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first binary number:");
        String binary1 = sc.nextLine();

        System.out.println("Enter the second binary number:");
        String binary2 = sc.nextLine();

        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        int sum = decimal1 + decimal2;
        String binarySum = Integer.toBinaryString(sum);
        System.out.println("Sum of " + binary1 + " and " + binary2 + " is: " + binarySum);

    }
}
*/


//
////5.•Java program to create calculator
public class Day1{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("hello!what you want to do?");
        System.out.println("1. addition (+)");
        System.out.println("2. subtraction (-)");
        System.out.println("3. multiplication (*)");
        System.out.println("4. divison (/)");
        int  op=sc.nextInt();
        System.out.println("enter 1st number");

        int a=sc.nextInt();
        System.out.println("enter 2nd number");

        int b= sc.nextInt();



        switch (op){
            case 1:
                System.out.println("sum of two numbers is:"+(a+b));
                break;
            case 2:
                System.out.println("sum of two numbers is:"+(a-b));
                break;
            case 3:
                System.out.println("sum of two numbers is:"+(a*b));
                break;
            case 4:
                System.out.println("sum of two numbers is:"+(a/b));
                break;
            default:
                System.out.println("invalid choice");
        }
    }
}