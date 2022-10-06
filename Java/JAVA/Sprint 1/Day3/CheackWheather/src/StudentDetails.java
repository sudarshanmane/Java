public class StudentDetails {

    int roll ;
    String name;
    int marks;

    void displayStudentDetails(int rollNo, String nameIs , int marksAre){
        roll = rollNo;
        name = nameIs;
        marks = marksAre;
        System.out.println("Roll is : "+  roll);
        System.out.println("Name is : "+  name);
        System.out.println("Marks is : "+  marks);
    };

    public static void main(String[] args) {
        StudentDetails  udit = new StudentDetails();
        StudentDetails punit = new StudentDetails();

        udit.displayStudentDetails(101,"Udit",90);
        System.out.println("--------------->");
        punit.displayStudentDetails(102,"Punit",95);
        System.out.println("--------------->");

        udit = punit;


        udit.displayStudentDetails(101,"Udit",90);
        System.out.println("--------------->");
        punit.displayStudentDetails(102,"Punit",95);



    }
}
