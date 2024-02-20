import java.util.Scanner;

public class assign3_2 {


   static int func(String s,long newn){

        StringBuilder news =new StringBuilder();
        long n=s.length(),freq=0;
        for (int i=0;i<newn;i++){

            if(news.length()<newn) {
                news.append(s);
            }
            else {
                break;
            }
        }
        news.setLength((int) newn);
        System.out.println(news);
        for (int i=0;i<news.length();i++){
            if(news.charAt(i)=='a'){
                freq++;
            }

        }
        return (int) freq;
    }
    public static void main(String[] args) {
        System.out.println("hy");
        System.out.println("enter string");
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
        System.out.println("enter number of characters to consider");
      int  newn=sc.nextInt();
        System.out.println(func(s,newn));

    }
}
