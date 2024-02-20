package java8practice;

import java.util.Arrays;
import java.util.List;

class MyPrinter{
    public void print(String str) {
        System.out.println(str);
    }
}
public class methodRefernces {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("ankit","nimit","naman","Raju");
        l1.forEach(i-> System.out.println(i));
        //call by method
        String str="Ankit Prajapati";
        MyPrinter mp=new MyPrinter();
        mp.print(str);
        l1.forEach(System.out::println);
    }
}
