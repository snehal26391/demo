package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByElement {
	
	public static void main(String[]args) throws InterruptedException {
		
		//JavascriptExecutor is an interface hence all methods present are incomplete 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/java/");
		
		Thread.sleep(2000);
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		
		WebElement code = driver.findElement(By.xpath("//a[@class=\"w3-left w3-btn\"]"));
		
		Thread.sleep(2000);
		
		Js.executeScript("arguments[0].scrollIntoView()",code);
				
				
				
		
		
		
		
		
		
		
		
		
		
	}

}
