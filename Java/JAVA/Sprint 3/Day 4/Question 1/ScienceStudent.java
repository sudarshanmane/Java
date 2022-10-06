
public class ScienceStudent extends Student{
	

	public ScienceStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	
	
	int phisicsMarks  ;
	int chemistryMarks = 100;
	int mathsMarks ;
	
	@Override
	public int getPercentage() {
		// TODO Auto-generated method stub
		return (phisicsMarks  + chemistryMarks + mathsMarks )*100/300;
	}
	
	void displayDetails() {
		System.out.println("Student Name : "+ name + " Address : " + address +  " total percentage : " +  getPercentage());
	}
	
	
		
		
		
		
		
	
	

}
