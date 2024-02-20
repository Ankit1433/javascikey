package assignment8;

import java.util.*;
//import java.util.Iterator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class practice {
    public static void main(String[] args) {
//        int[][] arr=new int[3][];
//        arr[0]= new int[]{1, 2, 3, 4};
//        arr[1]=new int[]{1,2};
//        arr[2]=new int[]{1,2,3};
//        for (int[] i:arr){
//            System.out.println(Arrays.toString(i));
        //}
        List<Integer> l1= Arrays.asList(1,2,3,4,12,20,35,46,55,68,75);
        System.out.println("--------------------");
        Predicate<Integer> p=new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if(i%5==0){
                    return true;
                }
                return false;
            }
        };
        System.out.println(l1.stream().
                filter(p).
                map(i->i*2).
                findFirst()
                .orElse(0)
        );

        //without stream
//        l1.forEach(System.out::println);
//        int result=0;
//        for(int i:l1){
//            if(i%5==0) {
//                result += i;
//            }
//        }
//        System.out.println(result);
//
        //with stream
        System.out.println(l1.stream().filter(i->i%5==0).reduce(0, Integer::sum));

        System.out.println("--------------------");
        //with iterator
//        Iterator<Integer> i=l1.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//        //lambda
//        l1.forEach(i->doubleIt(i));
//        //method references
//        l1.forEach(practice::doubleIt);
//        int result=0;
//        for (int i:l1){
//            result=result+i*2;
//        }
//        System.out.println(result);
        Function<Integer,Integer> f=new Function<Integer, Integer>() {
            public Integer apply(Integer i) {
                return i*2;
            }
        };

        BinaryOperator<Integer> b=new BinaryOperator<>() {
            @Override
            public Integer apply(Integer i,Integer j) {

                return i+j;
            }
        };
        l1.stream().filter(i->i%5==0);
       // Stream s1= s.map(f);

        //2 4 6 8
        //initally 0+2 in reduce
        //2+4
        //6+8
//        Integer result=l1.stream().map(i->i+2).reduce(0,(c,e)->c+e);
//        System.out.println(result);
//        System.out.println(l1.stream().map(i->i*2).reduce(0,(i,j)->i+j));
//
//        System.out.println(l1.stream().map(i->i*2).reduce(0,(i,j)->Integer.sum(i,j)));
//
//        System.out.println(l1.stream().map(i->i*2).reduce(0, Integer::sum));
        System.out.println("-----------------");
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10>j%10){
                    return 1;
                }

                return -1;
            }
        };
        l1.sort(com);
        System.out.println(l1);



    }
//    static  void  doubleIt(int i){
//        System.out.println(i*2);
//    }
}
