public class StudentDatails {

    String name ;
    int rollNo ;
    int mobileNumber;
    void assignDetails(String n, int r,int m){
        name = n ;
        rollNo = r;
        mobileNumber = m;
    };

    void printDetails(){
        System.out.println("name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("mobile No : "+ mobileNumber);
    }

    public static void main(String[] args) {
        StudentDatails object = new StudentDatails();
        StudentDatails object1 = new StudentDatails();
        StudentDatails object2 = new StudentDatails();
        object = object1 = object2;

        object.assignDetails("Sudarshan", 101, 9370105);
        object.printDetails();
        System.out.println("------------>");


        object1.assignDetails("Gaurav", 102, 947050);
        object1.printDetails();
        System.out.println("------------>");

        object2.assignDetails("Manish", 103, 952413);
        object2.printDetails();
        System.out.println("------------->");

    }
}