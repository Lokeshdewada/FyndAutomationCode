package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;

public class SecondProgram {

	public static void main(String[] args) throws Exception {
		// Second Program in java

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lokes\\OneDrive\\Desktop\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("lokeshdewada5@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Lokesh@123");
		driver.close();

	}

}
