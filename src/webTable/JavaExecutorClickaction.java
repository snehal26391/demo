package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutorClickaction {
	
	public static void main (String[]args) {
		//element is set at the backend DOM structue is obtain by Click method, if element is invisible then  it obtain 
		//by using Javascriptexecutor
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		JavascriptExecutor  Js= (JavascriptExecutor)driver;
		
		WebElement Click = driver.findElement(By.xpath("//input[@value=\"Log in\"]"));
		
		Js.executeScript("arguments[0].Click()", Click);
		
		
	}

}
