package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	
public ViewLeadPage(ChromeDriver driver) {
		
		this.driver=driver;
	}

	public ViewLeadPage verifyLeadPage() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		
		return this;
		
	}
	
	public EditLeadPage clickOnEditButton() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	

	public MyLeadsPage clickOnDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage(driver);
	}
	
	

public ViewLeadPage validateChangedCompanyName() {
		
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TCS")) {
			System.out.println("Lead is editted successfully");
		}
		else {
			System.out.println("Lead is not editted");
		}
		return this;
	}


}
