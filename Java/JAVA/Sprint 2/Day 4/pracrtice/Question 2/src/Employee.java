public class Employee extends Member{


    String Specialisation ;
    String  Department ;


    Employee(String name, int age, String phoneNumber, String address, double salary) {
        super(name, age, phoneNumber, address, salary);
    }

    @Override
    public String toString() {

        return " Employee " + name  + " " + " " +  age + " "+ " " + phoneNumber
                + " " + address + " " + salary;
    }
}
