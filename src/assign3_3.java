import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class assign3_3 {

   static int getPair(int[] arr, int n){
        int count=0;
      
        Map<Integer,Integer> hmp=new HashMap<>();
        for (int i=0;i<n;i++) {
            int key = arr[i];
            if (hmp.containsKey(arr[i])) {
                hmp.put(arr[i], hmp.get(arr[i]) + 1);
            } else {
                hmp.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer,Integer> itr: hmp.entrySet()){
            System.out.println("sock type:  "+itr.getKey()+" "+"value:  "+ itr.getValue());
            System.out.println(" ");
        }

       System.out.println("number of pairs are: ");
        for (Map.Entry<Integer,Integer> itr: hmp.entrySet()){
            count=count+itr.getValue()/2;

        }

        return count;
    }



    public static void main(String[] args) {
        System.out.println("hy");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of socks in pile");
        int n= sc.nextInt();
        System.out.println("enter colors of each sock(in array form)");
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(getPair(arr,n));


    }
}
