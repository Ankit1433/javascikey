import java.util.Scanner;

public class assign5_5 {

    public static void main(String[] args) {
        System.out.println("hy");
        System.out.println("Enter the digit to display from (0-9)");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      String[] digits={
              " _ \n| |\n|_|",  // 0
              "   \n  |\n  |",  // 1
              " _ \n _|\n|_ ",  // 2
              " _ \n _|\n _|",  // 3
              "   \n|_|\n  |",  // 4
              " _ \n|_ \n _|",  // 5
              " _ \n|_ \n|_|",  // 6
              " _ \n  |\n  |",  // 7
              " _ \n|_|\n|_|",  // 8
              " _ \n|_|\n _|"   // 9
        };
        System.out.println(digits[n]);

    }
}
