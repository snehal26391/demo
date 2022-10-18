package pageobjectmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginpage3 {
	
	@FindBy(xpath= "//span[@class=\"user-id\"]")WebElement UserName;

	 public KiteLoginpage3(WebDriver driver) {
			
			//PageFactory.initElements(driver,this);
	
	public void UserID() {
		
	UserName.getText();
	}

}

