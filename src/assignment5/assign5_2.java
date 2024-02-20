
abstract class Employee {
    int id;
    String empName;
    double grossSalary;
    double incomeTax;
    double providentFund;
    double professionalTax;
    double netSalary;

    abstract double display();

    abstract void calculateNetSalary();
}

  class  manager extends Employee{
manager(double grossSalary,double incomeTax,double providentFund,double professionalTax){
this.grossSalary=grossSalary;
this.incomeTax=incomeTax;
this.providentFund=providentFund;
this.professionalTax=professionalTax;
}

        @Override
        double display() {
            return netSalary;
        }

        @Override
        void calculateNetSalary(){
            netSalary=grossSalary-(incomeTax+providentFund+professionalTax);
        }
    }







class  clerk extends Employee{
    clerk(double grossSalary,double incomeTax,double providentFund,double professionalTax){
        this.grossSalary=grossSalary;
        this.incomeTax=incomeTax;
        this.providentFund=providentFund;
        this.professionalTax=professionalTax;
    }

    @Override
    double display() {
        return netSalary;
    }

    @Override
    void calculateNetSalary(){
        netSalary=grossSalary-(incomeTax+providentFund+professionalTax);
    }
}


public class assign5_2 {
    public static void main(String[] args) {
        System.out.println("hy");
        System.out.println("calculate net salary");
        double grossSalary=10000;
        double incomeTax=1000;
        double	 providentFund=800;
        double professionalTax=500;
        Employee m1 =new manager(grossSalary,incomeTax,providentFund,professionalTax);
        Employee m2=new clerk(grossSalary,incomeTax,providentFund,professionalTax);
        m1.calculateNetSalary();
        System.out.println("salary of employee is"+m1.display());

    }
}
