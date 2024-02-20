package assignment6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface Calculator{
    int calculate(int a,int b);
}
interface square{
    int calculate(int x);
}
interface drawable{
    public void draw(int a);
}
interface sayable{
    String say(String name);
}




public class practice {
//    public static int Subtract(int a,int b){
//        return a-b;
//    }
    public static void main(String[] args) {
        Calculator addition= Integer::sum;
        int sum=addition.calculate(5,4);
        System.out.println("sum: "+sum);
//        Calculator subtraction=practice::Subtract;
//        int diffrence=subtraction.calculate(8,4);
//        System.out.println("difference:"+diffrence);
//        square s=(int x)->x*x;
//        int sum=s.calculate(5);
//        System.out.println(sum);

//        List<String> names= Arrays.asList( "Geek", "GeeksQuiz", "g1", "QA", "Geek2");
////        System.out.println(names);
//        Predicate<String> p=(s)->s.startsWith("G");
//        for (String st:names){
//            if(!p.test(st)){
//                System.out.println(st);
//            }
    int width=10;
        drawable d=(a)-> System.out.println("width:"+a);
        d.draw(100);

        sayable s=(name)->{
    return "hello"+name;
        };
        System.out.println(s.say("ankit"));

        }

//    }
}
