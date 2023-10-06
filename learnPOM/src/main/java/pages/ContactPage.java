package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ContactPage extends BaseClass {
public ContactPage(ChromeDriver driver) {
		
		this.driver=driver;
	}

public CreateContactPage clickOnCreateContactLink() {
	driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
	return new CreateContactPage(driver);
}

}
