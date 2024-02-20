package java8practice;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;


interface Phone{
    void call();
    default void message(){
        System.out.println("hy");
    }
}
class AndroidPhone implements Phone{


    public void call() {
        System.out.println("calling");
    }

}
public class java8features {
    public static void main(String[] args) {
////        Phone p=new AndroidPhone();
////        p.call();
////        p.message();
//        List<Integer> l1= Arrays.asList(1,2,3,4);
////        for (int i:l1){
////            System.out.println(i);
////        }
//
//        l1.forEach(integer ->
//                {if(integer%2==0){
//                    System.out.println(integer);
//                }
//                }
//                );//lambda //consumer
//
//
//        Consumer<Integer> c=new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        l1.forEach(c);

//        ArrayList<Integer> arr=new ArrayList<Integer>();
//        arr.add(5);
//        arr.add(2);
//        arr.add(1);
//        arr.add(6);
//        arr.add(10);
//        Iterator<Integer> ite= arr.iterator();
//        //3 method to iterate
      //1
//        int i=0;
//        while (ite.hasNext()){
//            i= ite.next();
//           if(i%2==0){
//               ite.remove();
//               System.out.println(i);
//           }
//            System.out.println(i);
//        }
        //2
//        for (Integer integer : arr) {
//            System.out.println(integer);
//        }
        //3
       // System.out.println(arr);


        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int low=0;
        int high=A.length()-1;
        boolean flag=false;
        while(low<high){
            if(A.charAt(low)==A.charAt(high)){
                low++;
                high--;
            }
            else{
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }

    }
}
