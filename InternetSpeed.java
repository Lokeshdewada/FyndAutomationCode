import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetSpeed {

	public static void main(String[] args) throws Exception {
	//Internt speed 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lokes\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://fast.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		String speed = driver.findElement(By.id("speed-value")).getText();
		String speedUnit = driver.findElement(By.id("speed-units")).getText();
		
		System.out.println("Internet speed is:"+speed+" "+speedUnit);
		driver.close();
	}

}
