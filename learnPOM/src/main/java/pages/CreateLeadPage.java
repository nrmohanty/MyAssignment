package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{

	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage eneterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return this;
	}

	public CreateLeadPage eneterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		return this;
	}

	public CreateLeadPage eneterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
		return this;
	}

	public CreateLeadPage enterPhoneNo() {

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		return this;
	}

	public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();

		return new ViewLeadPage(driver);	
	}

}
