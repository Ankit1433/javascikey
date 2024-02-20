package assignment6;

@FunctionalInterface
interface Calculate{
    void calculate(int n);
}
public class assign6_3 {

    public static void main(String[] args) {
        Calculate c=(n) -> {
            int n1=0,n2=1,n3;
            System.out.print(n1+" "+n2);
            for (int i=2;i<n;i++){
                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
            }
        };
        c.calculate(5);

    }
}
