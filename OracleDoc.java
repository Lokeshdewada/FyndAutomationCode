package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracleDoc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lokes\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");

		driver.manage().window().maximize();

		// driver.findElement(By.cssSelector("a[href=\"java/awt/package-frame.html\"]")).click();

		// driver.close();
		// Run a program no sach element showing because a the frame

		// Creating WebElementfor frame

		WebElement f1 = driver.findElement(By.name("packageListFrame"));
		WebElement f2 = driver.findElement(By.name("packageFrame"));
		
		// driver.switchTo().frame(f1).findElement(By.cssSelector("a[href=\"java/awt/package-frame.html\"]")).click();

		// How many link are there

		List<WebElement> LinkCount = driver.switchTo().frame(f2).findElements(By.tagName("a"));
		System.out.println(LinkCount.size());
		
		for(int i=0; i<LinkCount.size(); i++) {
			String linkname = LinkCount.get(i).getText();
			if(linkname.contains("Abstract")==true) {
				System.out.println(linkname);
			}
		}
		driver.close();
	}

}
