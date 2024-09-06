package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements2 {

	   //Number of images of count a rediff.com application 
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lokes\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");

		driver.manage().window().maximize();
		
		List<WebElement> imgeCount = driver.findElements(By.tagName("img"));
		
		System.out.println("Total Number of the  images is : "+imgeCount.size());
       driver.close();
	}

}
