package Person;

public class Student extends Person {
	
	int studentId = 1;
	String courseEnrolled = "JA111" ;
	int courseFee = 30000;
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", "
				+ "courseFee=" + courseFee
				+ address + "]";
	}
	
	

}
