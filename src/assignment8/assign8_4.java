package assignment8;

import java.util.*;
import java.util.stream.Collectors;

//8.4.1 Counting Empty String using Lambda expressions
//8.4.2 Count String whose length is more than three
//8.4.3 Count number of String which starts with "a"
//8.4.4 Remove all empty Strings from List
//8.4.5 Create a List with String more than 2 characters
//8.4.6 Convert String to uppercase and Join them with coma
//8.4.7 Create a List of the square of all distinct numbers
//8.4.8 Get count, min, max, sum, and the average for numbers
interface countString{
    void emptyString(String str);
}
public class assign8_4 {


    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("");
        l1.add("ankit");
        l1.add("dhruv");
        l1.add("");
        l1.add("vr");
        l1.add("");
        System.out.println(l1);
      long count=  l1.stream().filter(String::isEmpty).count();
        System.out.println("count of empty String is"+count);
        long countLen=  l1.stream().filter(i->i.length()>3).count();
        System.out.println("count of  String whose length is greater than 3 is: "+countLen);
        long countWithA=  l1.stream().filter(i->i.startsWith("a")).count();
        System.out.println("count of String whose starts with a: "+countWithA);
        //l1.removeIf(String::isEmpty);
        System.out.println(l1);
        //        for (String i:l1){
//            if(i.length()>2){
//                l2.add(i);
//            }
//        }
//        System.out.println("Count of String length >2 is: "+l2);
        //l2.addAll(l1.stream().filter(i->i.length()>2).toList());
        List<String> l2 = new ArrayList<>(l1.stream().filter(i -> i.length() > 2).toList());
        System.out.println(l2);
        String result=l1.stream().filter(s->!s.isEmpty()).map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println("upperCase and joining with ','"+result);
        List<Integer> l3=Arrays.asList(10,20,10,40,20,40,50,70);
        List<Integer> l4=l3.stream().distinct().map(i->i*i).collect(Collectors.toList());
        System.out.println(l4);
        List<Integer> l5=Arrays.asList(10,20,30,50,70,123,45,99);
     long count2= l5.size();
        System.out.println("count of numbers are:"+count2);
       Optional<Integer> max= l5.stream().max(Integer::compareTo);
        System.out.println("max of   numbers are:"+max.get());
        Optional<Integer> min= l5.stream().min(Integer::compareTo);
        System.out.println("min of  numbers are:"+min.get());
        Optional<Integer> sum= l5.stream().reduce(Integer::sum);
        System.out.println("sum of  numbers are:"+sum.get());
        OptionalDouble avg= l5.stream().mapToInt(Integer::intValue).average();
        System.out.println("Average of  numbers are:"+avg.getAsDouble());

    }

}
