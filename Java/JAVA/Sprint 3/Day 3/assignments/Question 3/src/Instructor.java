public class Instructor extends Person {

    int instructorId= 0001 ;
    int salary = 1400000;


    @Override
    public String toString() {
        return "Instructor{" +
                "instructorId=" + instructorId +
                ", salary=" + salary + "address" + address.toString() +  "}";
    }
}

