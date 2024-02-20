import java.util.Scanner;

//Given a string and two indices start and end print a substring consisting of all
//characters in the inclusive range from start to end.
public class assign5_9 {
    public static void main(String[] args) {
        System.out.println("hello! Enter your String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("enter start");
        int start=sc.nextInt();
        System.out.println("enter end");
        int end=sc.nextInt();
        if (end!=s.length()){
            end=end+1;
        }

            System.out.println(s.substring(start,end));


    }
}
