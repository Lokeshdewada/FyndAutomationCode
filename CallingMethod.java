package Automation;

public class CallingMethod {

	public static void main(String[] args) {
		// Creating object for reusable method class
		ReuseableMethod m = new ReuseableMethod();
		
		//Calling launch application method 
		
		m.launchApp("https://www.facebook.com/");
     
		m.elementAvailable("email", true);
		m.elementEnabled("email", true);
		m.elementAvailable("pass", true);
		m.elementEnabled("pass", false);
		
		//Closing Application
		m.closeApp();
	}

}
