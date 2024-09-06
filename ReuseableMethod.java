package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReuseableMethod {

        public WebDriver driver;
		// Creating for launching the application 
		
		public void launchApp(String url){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lokes\\OneDrive\\Desktop\\chromedriver.exe");
			 driver = new ChromeDriver();

			driver.get("https://www.rediff.com/");
             driver.get(url);
			driver.manage().window().maximize();
			
		}
		
		//Creating a method closing the application 
		
		public void closeApp() {
			driver.close();
		}
		
		//Creating a method  to verify elements is enable or not application 
		
		public void elementAvailable(String loc, boolean exp) {
		boolean elementAvaialable = driver.findElement(By.id(loc)).isDisplayed();
		
		if(elementAvaialable==exp ) 
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fall");
		}
		}

		
		
		public void elementEnabled(String loc,boolean exp) {
			boolean elementEnabled = driver.findElement(By.id(loc)).isEnabled();
			
			if(elementEnabled==exp ) 
			{
				System.out.println("Pass");
			}
			else {
				System.out.println("Fall");
			}
}
}