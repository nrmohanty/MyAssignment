package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateContact extends BaseClass {
	
	
		@Test
		public void mergeLead() throws InterruptedException  {
			LoginPage lp=new LoginPage(driver);
			lp.enterUserName().enterPassword().clickLogin().crmLinkClick().clickOnContactsTab().clickOnCreateContactLink().enterFirstName().enterLastName().clickOnCreateContactButton().validateViewContact();
		
	}
	}


