package java8practice;
class ank{
    public void show(){
        System.out.println("in a show");
    }
}

//class bnk{
//    public void show(){
//        System.out.println("in b show");
//    }
//}

public class anonymousInner {
    public static void main(String[] args) {
        //without anonymous inner class
//        ank obj=new bnk();
//        obj,show()
        //anonymous inner class
        ank obj=new ank() {
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
