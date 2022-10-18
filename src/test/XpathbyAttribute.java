package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyAttribute {
	public static void main(String[]args) throws InterruptedException {
		
		//step 1
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		
		//step 2
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfcMyPqIj7E0Ic4ggBdYBectRMKyTCOeGyAZ6AMg8pWmuTs5wQUIKZlHSol_oQ7X8jgvQqXV9AAL5NjI7mcfORQQZ80QSx8n7LCBXyJfA6InWg&smuh=41730&lh=Ac9zOiQsPhfPQ6gMEZ0");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@data-testid]")).sendKeys("mihika.@gmail.com");
		
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
			
			
	}

}
