package assignment8;
//3.Create an anonymous implementation of the SquareRoot interface and use it to find the square root value.
interface SquareRoot{
    void calculate(int num);
}
public class assign8_3 {
    public static void main(String[] args) {
        SquareRoot sr=(i)->{
            double result=Math.sqrt(i);
            System.out.println(result);
        };
        sr.calculate(25);
    }


}
