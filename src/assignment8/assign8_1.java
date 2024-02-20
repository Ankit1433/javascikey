package assignment8;

import java.util.Scanner;
import java.util.regex.Pattern;

//Check if a String Contains Only Alphabets in Java Using Lambda Expression
interface calculate {
    void show(String str);
}
public class assign8_1 {
    public static void main(String[] args) {
        System.out.println("enter String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        calculate obj = (String) -> {
            if (Pattern.matches("[a-zA-Z]*", str)) {
                System.out.println("The String Contains only Alphabet");
            } else {
                System.out.println("The String don't Contains Alphabet only");
            }

        };
        obj.show(str);


    }
}
