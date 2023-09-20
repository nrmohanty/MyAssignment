package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateContact extends BaseClass {
	
	@Test
	public  void CreateContactTestCase() {
				
		// Click on contacts Button
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		
		//Click on Create Contact
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Nihar");
		
		
		
		
	}

}
