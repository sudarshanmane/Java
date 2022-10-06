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

    private char  calculateGrade(int marks){

        if(marks >= 500){
            setGrade('A');
        }else if(marks <500 && marks>=400){
            setGrade('B');
        }
        else if(marks< 400){
            setGrade('B');
        }
        return grade;
    }

    public Student(int roll, String name, int marks) {
        setMarks(marks);
        setRoll(roll);
        setName(name);
    }

    public void displayDetails(){
        Student student = new Student(101,"Sudarshan",501);
       calculateGrade(501);

    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" +  roll +
                ", name='" + name + '\'' +
                ", marks=" + getMarks() +
                ", grade=" + getGrade() +
                '}';
    }
}
