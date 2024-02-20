package assignment6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {

        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class practice2 {
    public static void main(String[] args) {
        List<Product> list=new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(3,"Keyboard",300f));
        list.add(new Product(2,"Dell Mouse",150f));
        list.add(new Product(4,"ankit",8000f));

//        System.out.println("Sorting on the basis of name...");
//
//        // implementing lambda expression
//        list.sort((p1, p2) -> {
//            return p1.name.compareTo(p2.name);
//        });
//        for(Product p:list){
//            System.out.println(p.id+" "+p.name+" "+p.price);
//        }

        Stream<Product> fil=list.stream().filter(p->p.price>3000).limit(1);
        fil.forEach(product -> System.out.println(  product.name+" "+product.price));


    }
}

