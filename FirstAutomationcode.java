package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstAutomationcode {

	public static void main(String[] args) throws InterruptedException {
		
		//SeleniumFirstprogram in java
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lokes\\OneDrive\\Desktop\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.close(); //Close the application 
	}

}
