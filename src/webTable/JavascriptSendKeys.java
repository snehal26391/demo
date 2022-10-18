package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptSendKeys {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		WebElement Web = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		
		WebElement Pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		
		//First Way
		
		//Js.executeScript("arguments[0].value= 'snehaldharme';" ,Web);
		
		//Js.executeScript("arguments[0].value = 'snehal@123';",Pass);
		
		//Second Way
		
		Js.executeScript("document.getElementById('email').value='snehaldharme';");
		Js.executeScript("document.getElementById('pass').value='snehal@123';");
		
		
}

}
