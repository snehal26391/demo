package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot4 {
	
	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[1]")).sendKeys("Pune");
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Mumbai");
		
		
		
	}

}
