package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateContactPage extends BaseClass {
public CreateContactPage(ChromeDriver driver) {
		
		this.driver=driver;
	}
	
	public CreateContactPage enterFirstName() {
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Nihar");
		return this;
	}

	public CreateContactPage enterLastName() {
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Mohanty");
		return this;

	}
	
	public ViewContactPage clickOnCreateContactButton() {
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		return new ViewContactPage(driver);

	}
	
}
