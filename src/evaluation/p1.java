package evaluation;

import java.util.*;

/*
•Java Program to Find Winner and Runner-up from given array of marks
•Java Program to Print All the Repeated Numbers with Frequency in an Array
•Take input of 2 binary number and Write function to find sum for the same
•Java program to create calculator*/
public class p1 {
    public static void main(String[] args) {
//Java Program to Remove Duplicate Elements From the Array
//        int[] arr={1,3,4,5,6,8,3,2,4,8,7};
//        List<Integer> l1=new ArrayList<>();
//        for (int i:arr){
//            if(!l1.contains(i)){
//                l1.add(i);
//
//            }        }
//      for (Integer integer : l1) {
//          System.out.println(integer);
//      }
//Java Program to Find Winner and Runner-up from given array of marks
        int[] marks={10,30,50,90,70,80,99,200,120};
        System.out.println(Arrays.stream(marks)
                .boxed().
                sorted(Comparator.reverseOrder() )
                .skip(1)
                .findFirst().get());
//        int winner=0;
//        int runnerUp=0;
//        for (int mark : marks) {
//            if (mark > winner) {
//                runnerUp = winner;
//                winner = mark;
//            }
//            if (mark != winner && mark > runnerUp) {
//                runnerUp = mark;
//            }
//        }
//        System.out.println("winner is"+winner);
//        System.out.println("runnerUp is"+runnerUp);
//•Java Program to Print All the Repeated Numbers with Frequency in an Array
//        HashMap<Integer,Integer> h=new LinkedHashMap<>();
//        int[] arrn={1,2,3,4,51,2,6,8,6,9};
//
//        for (int i :arrn) {
//            h.put(i, h.getOrDefault(i,0) + 1);
//        }
//        for (Map.Entry<Integer,Integer> e:h.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }
//        System.out.println("----------------------------------------");
//        for (Map.Entry<Integer,Integer> e:h.entrySet()){
//            if(e.getValue()>1) {
//                System.out.println(e.getKey() + " " + e.getValue());
//            }
//
//       }

    }
}
