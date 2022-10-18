package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyText {
	public static void main (String[]args) throws InterruptedException {
		
		// Step 1
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver.exe");
		
		//Step 2
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()=\"Log in to Facebook\"]")).click();
		
				driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sne@123456");
		
		
				
	}

}
