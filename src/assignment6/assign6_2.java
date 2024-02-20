package assignment6;
//Create a Student class with attributes such as name, age, and grade. Implement functionalities like
//adding new students, finding students by name, calculating the average age of students, and sorting students by grade.
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
    String name;
    int age;
    String grade;
    Student(String name,int age,String grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }


}


public class assign6_2 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("ankit",21,"A"));
        list.add(new Student("nimit",19,"B"));
        list.add(new Student("Pruthvi",31,"C"));
        list.add(new Student("Vijay",20,"D"));
        Stream<Student> str= list.stream();
        str.forEach(
                i-> System.out.println(i.age+" "+i.name+" "+i.grade)
        );
        list.stream().filter(p->p.name.contains("ankit")).forEach(
                i-> System.out.println(i.age+" "+i.name+" "+i.grade)
        );
    list.stream().sorted(Comparator.comparing(student -> student.grade))
            .forEach(student -> System.out.println(student.age+" "+student.grade+" "+student.name));
     OptionalDouble calcAvg=  list.stream().mapToDouble(st->st.age).average();
        System.out.println("average age of students are"+calcAvg);




    }
}
