package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class EditLeadPage extends BaseClass {
	public EditLeadPage(ChromeDriver driver) {

		this.driver=driver;
	}

	
	
	public EditLeadPage updateCompanyName() {
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("TCS");
		return this;
	}

	public ViewLeadPage clickOnUpdateButton() {

		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}


}

