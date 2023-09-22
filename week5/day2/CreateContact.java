package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateContact extends BaseClass {
	
	@Test
	public  void CreateContactTestCase() throws InterruptedException {
				
		// Click on contacts Button
		driver.findElement(By.xpath("(//a[contains(text(),'Contacts')])[1]")).click();
		
		//Click on Create Contact
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		Thread.sleep(3000);
		
		//Enter FirstName Field Using id Locator
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Nihar");
		
		//Enter Lastname field Using id locator
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Mohanty");
		
		//Click on the Create Contact button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
	}

}
