package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot2 {
	
	public static void main (String[]args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/?");
		
		
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		File Destination = new File("C:\\Users\\Admin\\Desktop\\Screenshot/Flipkart.png");
		
		FileHandler.copy(Source, Destination);
		
		
	}
	
}
