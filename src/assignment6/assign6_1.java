package assignment6;

import java.util.*;

public class assign6_1 {

    public static void main(String[] args) {
        //Java Program to Remove Duplicate Elements From the Array
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 2, 1};
        HashSet<Integer> hs = new HashSet<>();

        Arrays.stream(arr).forEach(hs::add);
        System.out.println(hs);

//Java Program to Find Winner and RunnerUp from given array of marks
        int[]marks={10,20,50,70,30};
       Integer[] soMarks= Arrays.stream(marks).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        System.out.println("winner:"+soMarks[0]);
        System.out.println("runnerUp:"+soMarks[1]);
       // Java Program to Print All the Repeated Numbers with Frequency in an Array
       HashMap<Integer,Integer> hmp=new HashMap<>();
       for (int i:arr){
           hmp.put(i,hmp.getOrDefault(i,0)+1);
       }
       hmp.forEach((num,value)->{
           if(value>1){
               System.out.println(num+" - "+"Frequency:"+value);
           }
       });
    }}

