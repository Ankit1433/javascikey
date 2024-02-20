import java.text.ParseException;
import java.util.Scanner;

 class NegativeSizeException extends Throwable {
    public NegativeSizeException(String s) {
        super(s);
    }
}

public class assign5_3 {

static Scanner sc=new Scanner(System.in);
    void insertelements(int n,int arr[]){
        for (int i=0;i< arr.length;i++) {
            int value= sc.nextInt();
            try {


                if (value < 0) {

                    throw new NegativeSizeException("negative values not allowed inside array");

                }
                else {
                    arr[i]=value;
                }
            }
            catch (NegativeSizeException nse){
                System.out.println("negative values not allowed inside array");
            }

        }
        for (int j:arr) {
            if(j>0) {
                System.out.println(j);
            }
            else {
                j++;
            }
        }
    }


    public static void main(String[] args) {
            assign5_3 obj=new assign5_3();
        System.out.println("enter length of array");
        int n=sc.nextInt();
        System.out.println("enter elements of array");
        int[] arr = new int[n];
         obj.insertelements(n,arr);


            }
        }


