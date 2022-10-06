package Question7;

import java.util.Comparator;

public class StudentRoll implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.RollNo>o2.RollNo)
		return +1;
		else
			return -1;
	}

}
