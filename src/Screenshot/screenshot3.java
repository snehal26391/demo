package Screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot3 {

	static WebDriver driver;
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chromedriver.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.get("https://www.amazon.in/");
		
		driver.get("https://www.swiggy.com/?");
		
		driver.quit();
	
		Thread.sleep(2000);
		
	}
	public static void TakeScreenshot(String filename) {
		
		
		//File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(3);
		
		//File Destination = new File("C:\\Users\\Admin\\Desktop\\Screenshot"+filename+""+random+.jpg);
		
		//FileHandler.copy(Source, Destination);
		
		
		
		
		
	}
	
	
}
