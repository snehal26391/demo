package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Notes\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Snehal@123");
		
		Actions act = new Actions(driver);
		
		
		WebElement Login = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		
		act.moveToElement(Login).build().perform();
		
		
		
		
	}

}
