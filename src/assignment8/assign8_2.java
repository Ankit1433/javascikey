package assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Remove elements from a List that satisfy given predicate in Java
public class assign8_2 {
    public static void main(String[] args) {
        Predicate<Integer> p=(i)->{
           if(i==0){
               return false;
           }
           return true;
        };

        List<Integer> l1=new ArrayList<>();
        int[]arr={10,0,20,30,0,40,50};
        for (int i:arr){
            l1.add(i);
        }
        System.out.println(l1);
       l1.stream().filter(i->(i!=0)).forEach(System.out::println);
        }
}
