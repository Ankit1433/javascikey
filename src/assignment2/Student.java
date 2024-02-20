
class Student{
    int rollno;
    String name;
    float fee;
    Address address;
    Student(int rollno,String name,float fee,Address address){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
        this.address=address;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee+" "+address.city+" "+address.country);}
}