
public class Student {

    private int roll;
    private String name;
    private int marks;
    private char grade ;

    public Student() {

    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    private char  calculateGrade(){

        if(getMarks() >= 500){
            setGrade('A');
        }else if(getMarks() <500 && getMarks()>=400){
            setGrade('B');
        }
        else if(getMarks() < 400){
            setGrade('C');
        }

        return getGrade();
    }

    public Student(int roll, String name, int marks) {
        setRoll(roll);
        setName(name);
        setMarks(marks);
}
    public void displayDetails(int roll, String name, int marks){
       
        Student student = new Student(roll,name,marks);

       setGrade(student.calculateGrade());

       System.out.println(student);


    }

    @Override
    public String toString() {
        return
                "Student{" +
                "roll=" +  getRoll() +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade=" + grade +
                '}';
    }


}
