
public class Citizen {
	
	private String	name;
	private String aadharNumber;
	private String mobileNumber;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	void displayDetails(Citizen citizen) {
		System.out.println("Name of citizen : " + citizen.getName());
		System.out.println("MobileNumber of citizen : " + citizen.getMobileNumber());
		System.out.println("AadharNumber of citizen : " + citizen.getAadharNumber());

	}
	

}
