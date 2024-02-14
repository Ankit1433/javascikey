
class day3{
    boolean isPrime(int n) {
        boolean flag = true;
        if (n == 0 || n == 1) {
            return true;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;

                break;
            }
        }
        return flag;
    }
        public static void main(String[] args){
//        Address address=new Address("surat","guj","ind");
//        Address add=new Address("su","raj","us");
//        Student s1=new Student(111,"ankit",5000f,address);
//        Student s2=new Student(112,"sumit",6000f,add);
//        s1.display();
//        s2.display();
        day3 m =new day3();
            System.out.println(m.isPrime(12));
    }}

