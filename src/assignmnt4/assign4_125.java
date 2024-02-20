import java.util.regex.Pattern;

//1.Create a regular expression that accepts alphanumeric characters only.
// Its length must be six characters long only.
public class assign4_125 {
    public static void main(String[] args) {

//1.Create a regular expression that accepts alphanumeric characters only.
//Its length must be six characters long only.
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","aAz152"));
//2.Create a regular expression that accepts 10 digit numeric characters starting with 7, 8 or 9 only.
        System.out.println(Pattern.matches("[789][0-9]{9}","7016391409"));
//3.Check if a given string is Pangram in Java
//4.Print first letter of each word in a string using regex
    String only="hello good morning all of you";
   String[] words= only.split("\\s");

   for(String s:words){
       System.out.println(s.charAt(0));
   }
//5.Java Program to Swap Two Strings Without Using Third Variable
        StringBuilder s1=new StringBuilder("ankit");
        StringBuilder s2=new StringBuilder("nimit");
        s1.append(s2);
      System.out.println(s1);
      s2= new StringBuilder(s1.substring(0,s2.length()));
        s1=new StringBuilder(s1.substring(s2.length()));
        System.out.println(s1);
        System.out.println(s2);
        // a=a+b;
        //         b=a-b;
        //         a=a-b;
        //         System.out.println(a);
        //         System.out.println(b);
        // s1=s1.replace(s1,s2);
        //         a=a-b;


    }
}
