import javax.smartcardio.ATR;

public class Member {

    String name ;
    int age ;
    String phoneNumber ;
    String address ;
    double salary ;





    Member(String  name,int age,String phoneNumber,String address , double salary){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    };

    public Member() {

    }


    void printSalary(){
        System.out.println("Salary : " + salary  );

    }

}
