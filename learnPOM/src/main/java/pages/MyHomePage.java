package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	
public MyHomePage(ChromeDriver driver) {
		
		this.driver=driver;
	}

	public MyLeadsPage clickOnLeadsTab() {
		
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	}
	
	public ContactPage clickOnContactsTab() {
		driver.findElement(By.xpath("(//a[contains(text(),'Contacts')])[1]")).click();
		return new ContactPage(driver);

	}
}
