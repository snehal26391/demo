package webTable;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement code = driver.findElement(By.xpath("//h3[contains(text(),\"Example\")]"));
		
		Thread.sleep(3000);
		
		Js.executeScript("arguments[0].scrollIntoView()", code);
		
		//How many Rows in table 
		//First List interface
		
	List<WebElement> Row1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]"));
	
	System.out.println("Total No of Row :"+Row1);
	
	//Second method
	//int Row = driver.findElements(By.xpath("//table[@id=\\\"customers\\\"]/tbody/tr[2]"));
	
	
	//How many columns in table 
	//first method
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td[2]"));
		
		System.out.println("Total No of Column:"+col);
	}

}
