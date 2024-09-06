package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiElementslinkCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lokes\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rediff.com/");

		driver.manage().window().maximize();

		List<WebElement> imageCount = driver.findElements(By.tagName("img"));

		List<WebElement> linkCount = driver.findElements(By.tagName("a"));

		System.out.println("Total Number of images is:" + imageCount.size());
		System.out.println("Total Number of images is:" + linkCount.size());

		if (linkCount.size() > imageCount.size()) {

			System.out.println("Number of link is greater than number of image");
		} else {
			System.out.println("Number of images is greater than number of link");
		}
		driver.close();
	}

}
