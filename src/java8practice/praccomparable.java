package java8practice;

import java.util.*;

//class AgeComparator implements Comparator<Student>{
//
//    @Override
//    public int compare(Student o1, Student o2) {
//        if(o1.Age==o2.Age){
//            return 0;
//        } else if (o1.Age>o2.Age) {
//            return 1;
//        }
//        else {
//            return -1;
//        }
//    }
//}
//class Student implements Comparable<Student>{
//    int id;
//    String name;
//    int Age;
//    public Student(int id,String name,int age){
//        this.id=id;
//        this.name=name;
//        this.Age=age;
//    }
//    @Override
//    public int compareTo(Student student) {
//        return name.compareTo(student.name);
//    }
//}
public class praccomparable  {



    public static void main(String[] args) {
//        ArrayList<Student> al= new ArrayList<>();
//        al.add(new Student(1,"Viru",1));
//        al.add(new Student(2,"Saurav",60));
//        al.add(new Student(3,"Mukesh",23));
//        al.add(new Student(4,"Tahir",22));
//        Collections.sort(al);
//        for (Student i:al){
//            System.out.println(i.name);
//        }
//        al.sort(new AgeComparator());
//        for (Student i:al){
//            System.out.println(i.Age);
//        }
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Returns a Set view of the mappings contained in this map
        map.entrySet().stream().
                sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);

    }
}
