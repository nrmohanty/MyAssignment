package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {
	public MyLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}

	public FindLeadPage findLeads() {

		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage(driver);
	}

	public MergeLeadPage clickOnMergeLeadLink() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage(driver);
	}

}

