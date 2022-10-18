package pageobjectmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KiteLoginPage2 {
	@FindBy(xpath = "//input[@type=\"password\"]") WebElement PIN;
	
	
	@FindBy(xpath = "//button[@type=\"submit\"]") WebElement ContinueButton;
	
       public KiteLoginPage2(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		public void PIN() {
			PIN.sendKeys("111000");
			
		}	
		
		public void ContinueButton() {
			
			ContinueButton.click();
		}
		
	
	

}
