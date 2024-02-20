import java.util.Scanner;
import java.util.regex.Pattern;

public class assign5_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your Username");
        String s= sc.nextLine();
    if(!(s.length()>=8&&s.length()<=30)){
        System.out.println("invalid username! length should be between 8-30 characters");
    } else if (!Pattern.matches("[_a-zA-Z0-9]{8,30}",s)) {
        System.out.println("The username can only contain alphanumeric characters and \n" +
                "underscores (_)");
    }
    else if(Pattern.matches("[a-zA-Z.]",s)){
        System.out.println("The first character of the username must be an alphabetic character");
    }
    else {
        System.out.println("username perfect");
    }
    }
}
