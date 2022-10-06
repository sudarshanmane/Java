package Assignments;


public class Demo{


public static void main(String[] args) {
        String collageName = "NIT";
        Student object = new Student(101,"Sudarshan","Pune");
        Student.getStudent(true);

        collageName = "Pune";
        Student object1 = new Student(101,"Sudarshan","Pune","Pune");
        Student.getStudent(false);

}

        }
