import java.util.Comparator;

public class Sudent1Marks implements Comparator<Student1> {

	
	@Override
	public int compare(Student1 s1,Student1 s2) {
		
		if(s1.marks> s2.marks) {
			return +1;
		}
			
		else if(s1.marks<s2.marks){
			return -1;

		}
		else
			return 0;	
		
		}

}
