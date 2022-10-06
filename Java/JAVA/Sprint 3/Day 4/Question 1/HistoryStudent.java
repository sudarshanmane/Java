
public class HistoryStudent  extends Student{

	
	
	int historyMarks ;
	int civicsMarks ;
	
	

	public HistoryStudent(String name, String address) {
		super(name, address);
	}
	
	@Override
	public int getPercentage(){
		
		return (historyMarks + civicsMarks)*100/200;
	}
	
	void displayDetails() {
		System.out.println("Student Name : "+ name + " Address : " + address +  " total percentage : " +  getPercentage());
	}
	
	
		
		
	

	
	
	

	
	
	

	

}
