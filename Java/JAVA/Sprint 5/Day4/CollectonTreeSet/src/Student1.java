
public class Student1  {
	
	int roll ;
	String name ;
	int marks ;
	
	Student1(int roll, String name , int marks) {
		this.marks = marks;
		this.name = name;
		this.roll = roll;
		
	}

	public Student1() {
	}

	@Override
	public String toString() {
		return "Student1 [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
}
	