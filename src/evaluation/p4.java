package evaluation;

import java.util.regex.Pattern;

/*1.Create a regular expression that accepts alphanumeric characters only. Its length must be six characters long only.
2.Create a regular expression that accepts 10 digit numeric characters starting with 7, 8 or 9 only.
3.Check if a given string is Pangram in Java
4.Print first letter of each word in a string using regex
5.Java Program to Swap Two Strings Without Using Third Variable*/
public class p4 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","ankit1"));
        System.out.println(Pattern.matches("[+91]{3}[789][0-9]{9}","+917016391409"));

    }
}
