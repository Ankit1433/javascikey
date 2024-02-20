package assignment6;

import java.util.Arrays;
import java.util.List;

public class streamPrac {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4);
        l1.stream().filter(i->{ System.out.println("hy");return true;});
    }
}
