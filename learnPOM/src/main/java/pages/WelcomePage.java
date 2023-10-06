package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class WelcomePage extends BaseClass {

	public WelcomePage(ChromeDriver driver) {

		this.driver=driver;
	}

	public MyHomePage crmLinkClick() {
		//Check the Partial link text
		driver.findElement(By.partialLinkText("CRM")).click();
		return new MyHomePage(driver);
	}



}
