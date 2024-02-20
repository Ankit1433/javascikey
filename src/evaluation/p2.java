package evaluation;
//Java program to find whether the given number is armstrong number or not

import java.util.Scanner;

//•A left rotation operation on an array of size n, shifts each of the array's
// elements 1 unit to the left. Given an integer d, rotate the array
// that many steps left and return the result.
public class p2 {
    boolean isArmStrong(int n){
        int reversed=n,temp=0,r=0;
        while (n>0){
            r=n%10;
        temp+= (int) Math.pow(r,3);

            n=n/10;
        }

        return reversed == temp;
    }
    void leftRotate(int[] arr, int d){
        for (int i=0;i<arr.length-1;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }


    }
    void step(int[] arr,int d){
        for (int i=0;i<d;i++){
            leftRotate(arr,d);
        }
        for (int i:arr){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        p2 obj=new p2();
        if (obj.isArmStrong(153)){
            System.out.println("ArmStrong");
        }
        else {
            System.out.println("Not ArmStrong");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        System.out.println("enter elements of array:");
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter how many steps to rotate");
        int d= sc.nextInt();
        obj.step(arr,d);
        }
}
