package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbycontains{
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h2[contains(text(),\"Upgrade your home | Amazon Brands \")]"));
		Thread.sleep(1000);
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//div[@class=\"fl search-box clearfix\"]")).sendKeys("Mumbai");
		
		driver.quit();
	}
}
