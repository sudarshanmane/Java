public class Manager extends Member{

    String Specialisation ;
    String  Department ;

    Manager(String name, int age, String phoneNumber, String address, double salary) {
        super(name, age, phoneNumber, address, salary);
    }


    @Override
    public String toString() {

        return " Manager " + name  + " " + " " +  age + " "+ " " + phoneNumber + " " + address + " " + salary;
    }



}
