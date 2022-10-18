package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass1 {

	
	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		WebElement input1 = driver.findElement(By.xpath("//textarea[@name=\"text1\"]"));
		
		WebElement input2 = driver.findElement(By.xpath("//textarea[@name=\"text2\"]"));
		
		
		input1.sendKeys("Selenium is an Open Source Tool");
		
		
		Actions action = new Actions(driver);
		
		Thread.sleep(3000);
		
		//Control + A
		action.keyDown(Keys.CONTROL );
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//Control + C
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		Thread.sleep(5000);
		
		//TAB
		action.sendKeys(Keys.TAB);
		action.build().perform();
		
		Thread.sleep(3000);
		
	//Control +v
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		
		
		
	
		
		
		
		
	}
}
