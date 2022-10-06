package Person;

public class Main {

	public static Person generatePerson(Person person) {
		
		if(person instanceof Student) {
			return new Student();
			
		}else if (person instanceof Instructor) {
			return new Instructor();
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		
		Person newStudent =  generatePerson(new Student());
		
		Person newTeacher = generatePerson(new Instructor());
		
		System.out.println(newStudent);
		System.out.println(newTeacher);
		
		
		
		
		
		
		

	}

}
