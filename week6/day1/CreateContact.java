package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateContact extends BaseClass {
	
	@BeforeTest
	public void setValues() {
		
		ExcelFileName="CreateContact";
	}
	
	@Test(dataProvider="fetchData")
	public  void CreateContactTestCase(String fname,String lname) throws InterruptedException {
				
		// Click on contacts Button
		driver.findElement(By.xpath("(//a[contains(text(),'Contacts')])[1]")).click();
		
		//Click on Create Contact
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		Thread.sleep(3000);
		
		//Enter FirstName Field Using id Locator
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys(fname);
		
		//Enter Lastname field Using id locator
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys(lname);
		
		//Click on the Create Contact button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
	}

}
