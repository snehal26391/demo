package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {
	
	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.redbus.in/bus-tickets");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"txtSource\"]")).sendKeys("Pune");
		
		Thread.sleep(2000);
	
		List<WebElement>City =	driver.findElements(By.xpath("//li[@class=\"C120_slist-item\"]"));
		
		System.out.println(City.size());
		
		
		
		for(int i=0;i<City.size();i++) {
			
			City.get(i).getText();
			
			if (City.get(i).getText().equals("Swargate,Pune")) {
				
				System.out.println(City.get(i).getText());
				break;
	
			}
			Thread.sleep(2000);
				
			System.out.println();
			
			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Mumbai");
			
			Thread.sleep(3000);
			
			
			
			List<WebElement>Dest= driver.findElements(By.xpath("//li[@class=\"C120_slist-item\"]"));
			
			System.out.println(Dest.size());
			
			Thread.sleep(2000);
			
			for(int j=0;j<Dest.size();j++) {
				
				Dest.get(j).getText();
				
				if(Dest.get(j).getText().equals("Borivali,Mumbai")) {
					System.out.println(Dest.get(j).getText());
					Dest.get(j).click();
					break;
					
				}
			
			}
			driver.findElement(By.xpath("//input[@type=\"text\"]")).click();
			
			driver.findElement(By.xpath("//button[@class=\"D120_search_btn searchBuses\"]")).click();
		}
	
		
		
	}
}
