import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleWithDDF {

	@SuppressWarnings("deprecation")
	public static void main(String[]args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		FileInputStream  file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Kite.xlsx");
		
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String id = Sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys(id);
		
		Thread.sleep(2000);
		
		String password = Sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
		
		Thread.sleep(2000);
		String  Pin = Sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
		
		
		
		
		//driver.findElement(By.xpath("))
		
		
		
				

				
				
		
		
	}
}
