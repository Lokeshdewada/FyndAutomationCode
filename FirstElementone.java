package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstElementone {

	public static void main(String[] args) {
		
		//write a test Script the number of link in facebook application and print all  the link names which start with "M" 
		//Start with first open tab to showing start with  word M write us
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lokes\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Number of the  website: "+linkCount.size());
		
		for(int i =0;i<linkCount.size();i++) {
		String linkname = linkCount.get(i).getText();
		if(linkname.startsWith("M")==true)
			System.out.println(linkname); 
		}
		driver.close();
	}

}
