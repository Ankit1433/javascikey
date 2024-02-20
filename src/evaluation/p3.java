package evaluation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {

        /*
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
       String s = sc.nextLine();
        System.out.println("enter length up to you want");
       int  n = sc.nextInt();
       StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(s.repeat(n));
        stringBuilder.setLength(n);
        System.out.println(stringBuilder);
        for (int i=0;i<n;i++){
            if(stringBuilder.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);

*/



        int n=9;
        int[] arr={10,20,20,10,10,30,50,10,20};
        HashMap<Integer,Integer> hmp=new HashMap<>();
        for (int i:arr){
                hmp.put(i, hmp.getOrDefault(i,0)+1);
            }

        int count=0;
        for (Map.Entry<Integer,Integer> e: hmp.entrySet()){
               count=count+e.getValue()/2;
                System.out.println(e.getKey() + " " + e.getValue());

        }
        System.out.println("no of pairs are:"+count);
       // System.out.println(hmp.getOrDefault(4,0));
        }
}
