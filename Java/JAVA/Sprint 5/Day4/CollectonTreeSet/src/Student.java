
public class Student  implements Comparable<Student>{
	int roll ;
	String name ;
	int marks ;
	
	Student(int roll, String name , int marks) {
		this.marks = marks;
		this.name = name;
		this.roll = roll;
	}
//
//	@Override
//	public int compareTo(Student o) {
//		
//		Student s1 = this;
//		Student s2 = (Student) o;
//		
//		if(s1.marks> s2.marks) {
//			return +1;
//		}
//			
//		else if(s1.marks<s2.marks){
//			return -1;
//
//		}
//		else
//			return 0;
//
//	}
//	
	
//	@Override
//	public int compareTo(Student o) {
//		
//		Student s1 = this;
//		Student s2 = (Student) o;
//		
//		if(s1.marks> s2.marks) {
//			return +1;
//		}
//			
//		else {
//			return -1;
//
//		}
//
//
//	}

	
	
	@Override
	public int compareTo(Student o) {
		
		Student s1 = this;
		Student s2 = o;
		

		if(s1.marks> s2.marks) {
			return +1;
		}
			
		else if(s1.marks<s2.marks)
			return -1;
	   else
		return s1.name.compareTo(s2.name);
		
	}


		
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	
}
