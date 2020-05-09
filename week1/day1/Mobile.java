package week1.day1;

public class Mobile {
	
	String mobileBrand = "Oppo";
	double mobilePrice = 20000;
	int numberOfContacts = 50;
	long imeNum = 9090909090L;
	boolean isNew = true;
	
	public void makeCall() {
		// TODO Auto-generated method stub
		
		System.out.println("Make the call");
	}
	public void sendMessage() {
		// TODO Auto-generated method stub		
		System.out.println("Send the message");
	}
	
	public void takePicture() {
		// TODO Auto-generated method stub
		
		System.out.println("Take the picture");

	}	
	public static void main(String[] args) {
		
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMessage();
		myMobile.takePicture();
		
		String Brand = myMobile.mobileBrand;
		double Price = myMobile.mobilePrice;
		int Contacts = myMobile.numberOfContacts;
		long IMEI = myMobile.imeNum;
		System.out.println(Brand);
		System.out.println(Price);
		System.out.println(Contacts);
		System.out.println(IMEI);
		
		
	}

}
