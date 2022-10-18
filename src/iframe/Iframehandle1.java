package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframehandle1 {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("singleframe");
		
		Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@type=\"text\"]")).click();
	     
	     driver.switchTo().defaultContent();
		
		
		
		//driver.findElement(By.xpath(.click();
		
		
		
	}

}
