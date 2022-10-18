package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbytagname {
	
	public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe"); 
		
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get("https://www.redbus.in/?gclid=Cj0KCQjw08aYBhDlARIsAA_gb0db9RoD2W-KWL-gKThuCcHP0jyBT8gU0uCt1MpVFNOhxY5REq8NFSEaAuZyEALw_wcB");
	     
	 	
	}
	
	
     
}
