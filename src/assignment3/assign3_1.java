import java.util.Scanner;

public class assign3_1 {
    static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome(int n) {
        int reversed = n, sum = 0, temp;
        while (n > 0) {
            temp = n % 10;
            sum = sum * 10 + temp;
            n = n / 10;
        }
        return reversed == sum;
    }

    public static void main(String[] args) {
        System.out.println("Hello!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of operations:");
        int number = sc.nextInt();
        do {
            System.out.println("Enter the type of operation (1: Odd/Even, 2: Prime/Not Prime, 3: Palindrome/Not Palindrome):");
            int operation = sc.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Enter a number:");
                    int n = sc.nextInt();
                    if (isOdd(n)) {
                        System.out.println("Odd");
                    } else {
                        System.out.println("Even");
                    }
                    number--;
                    break;
                case 2:
                    System.out.println("Enter a number:");
                    n = sc.nextInt();
                    if (isPrime(n)) {
                        System.out.println("Prime");
                    } else {
                        System.out.println("Not Prime");
                    }
                    number--;
                    break;
                case 3:
                    System.out.println("Enter a number:");
                    n = sc.nextInt();
                    if (isPalindrome(n)) {
                        System.out.println("Palindrome");
                    } else {
                        System.out.println("Not Palindrome");
                    }
                    number--;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (number != 0);
        sc.close();
    }
}