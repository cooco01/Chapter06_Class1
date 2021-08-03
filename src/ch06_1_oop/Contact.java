package ch06_1_oop;

public class Contact {
	public static void main(String[] args) {
		
	}
	String emailAddress;
	String faxNumber;
	String name;
	
	
	public String getEmailAddress(){
		return emailAddress;
		
	}
	public String getFaxNumber(){
		return faxNumber;
		
	}
	public String getName(){
		return name;
		
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
}
