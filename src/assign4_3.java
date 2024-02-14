import java.util.Scanner;

public class assign4_3 {
    static void isPangram(String t){
    String str=t.toLowerCase();
    String s =   str.replaceAll(" ","");
        System.out.println(s);
    int[] count=new int[26];
        for (int i=0;i<s.length();i++){
        count[s.charAt(i)-'a']++;
    }
    boolean flag=false;
        for (int i=0;i< 26;i++){
            flag= count[i] != 0;
    }
        if (flag) {
        System.out.println("pangram");
    }
        else {
        System.out.println("not pangram");
    }
        //hy

}
    public static void main(String[] args) {
        System.out.println("hy");
//        System.out.println("enter string :");
//        Scanner sc = new Scanner(System.in);
//        String t = sc.nextLine();
//        isPangram(t);

    }
}