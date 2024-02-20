package java8practice;
interface A{
    void show();

}
public class lambda8 {
    public static void main(String[] args) {

    //without lambdaA
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("hy");
            }
        } ;//Anomyous class

        //with lambda
        A obj1 = () -> System.out.println("a");
        obj.show();

        obj1.show();
    }
}
