package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox1 {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/bus-tickets");
		
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//input[@id=\"txtSource\"]" )).sendKeys("Pune");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"txtDestination\"]")).sendKeys("Mumbai");
		
		
		
				
	
	}
	

}
