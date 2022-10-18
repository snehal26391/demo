package webTable;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownByPixel {
	
	public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		//1. ScrollDown or up By Pixels
		
		//Js.executeScript("window.scrollBy(0,2000)", "args");
		
		Thread.sleep(3000);
		//Js.executeScript("window.scrollBy(0,-1000","args");
		
		
		//2. ScrollDown till bottom or up
		
		Js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "args");
		
		
		Thread.sleep(2000);
		
		Js.executeScript("document.documentElement.ScrollTop=0", "args");
		
		
		
		
		
		
	}

}
