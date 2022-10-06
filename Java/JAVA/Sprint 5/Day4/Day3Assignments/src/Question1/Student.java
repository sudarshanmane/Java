package Question1;

public class Student {

	int RollNo; 
	String Name;
	int marks;
	
	public Student(int rollNo, String name, int marks) {
		super();
		RollNo = rollNo;
		Name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [RollNo=" + RollNo + ", Name=" + Name + ", marks=" + marks + "]";
	}
	
	
	

}
