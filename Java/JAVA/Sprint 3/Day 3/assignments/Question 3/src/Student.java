public class Student extends Person {
    int studentId = 101;

    String courseEnrolled = "Web Developer";
    int courseFee = 300000;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", courseEnrolled='" + courseEnrolled + '\'' +
                ", courseFee=" + courseFee +  "address" + address.toString() +
                '}';
    }
}
