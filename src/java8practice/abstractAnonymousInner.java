package java8practice;

abstract class j{
    public abstract void show();
}
//class k extends j{
//
//    @Override
//    public void show() {
//        System.out.println("in k show");
//    }
//}
public class abstractAnonymousInner {
    public static void main(String[] args) {
//        j obj=new k();
//        obj.show();
        j obj=new j() {
            @Override
            public void show() {
                System.out.println("in anonymous abstract");
            }
        };
        obj.show();
    }
}
