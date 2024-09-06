package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FacebookSignup {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lokes\\OneDrive\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("day")).sendKeys("05");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("October");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("2001");
		Thread.sleep(2000);
      //driver.close();
	}

}
