package assignment8;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Implement filters for employees based on criteria such as:
//Filtering employees based on their department.
//Filtering employees based on their salary range.
//Filtering employees based on their years of experience
class Employee{
    int id;
    String name;
    String department;
    double salary;
    int yearsOfExperience;


    public Employee(int id, String name, String department, double salary, int yearsOfExperience) {
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.yearsOfExperience=yearsOfExperience;
    }
}


interface EmployeeFilter{
    boolean filter(List<Employee> emp, Predicate<Employee> predicate);
}
public class assign8_5  {

    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1, "ankit", "CE", 2500, 2));
        employees.add(new Employee(2, "kamal", "IT", 3000, 3));
        employees.add(new Employee(3, "nimit", "CE", 4000, 4));
        //System.out.println(emp1.id+" "+emp1.name+" "+emp1.department+" "+emp1.salary+" "+emp1.yearsOfExperience);


        // Filtering employees based on department
        System.out.println("Employees in CE department:");
        printFilteredEmployees(employees, emp -> emp.department.equals("CE"));

        // Filtering employees based on salary range
        System.out.println("\nEmployees with salary between $2000 and $3500:");
        printFilteredEmployees(employees, emp -> emp.salary >= 2000 && emp.salary <= 3500);

        // Filtering employees based on years of experience
        System.out.println("\nEmployees with 2 to 3 years of experience:");
        printFilteredEmployees(employees, emp -> emp.yearsOfExperience >= 2 && emp.yearsOfExperience <= 3);
    }

    private static void printFilteredEmployees(List<Employee> employees, Predicate<Employee> predicate) {
        for (Employee emp : employees) {
            if (predicate.test(emp)) {
                System.out.println(emp.id + " " + emp.name + " " + emp.department + " " + emp.salary + " " + emp.yearsOfExperience);
            }
            }
    }
}
