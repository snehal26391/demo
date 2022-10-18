package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver1 {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://mrbool.com/");
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		WebElement Content = driver.findElement(By.xpath("//a[@class=\"menulink\"]"));
		
		// act.MoveTo(Content).Build().perform();
		
		WebElement Article= driver.findElement(By.xpath("Articles"));
		
		String Text = Article.getText();
		
		System.out.println(Text);
		
		
		
		
		
}

}
