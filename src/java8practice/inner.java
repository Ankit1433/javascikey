package java8practice;
class An{
    int age;
    public void show(){
        System.out.println("in show");
    }
    class Bn{
        public void config(){
            System.out.println("in config");
        }
    }
}
public class inner {
    public static void main(String[] args) {
        An obj1=new An();
        obj1.show();
     //   without static
        An.Bn obj2= obj1.new Bn();
        obj2.config();
        //with static Bn
//        An.Bn obj2=new An.Bn();
//        obj2.config();

    }
}
