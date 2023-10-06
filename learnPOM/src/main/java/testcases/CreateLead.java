package testcases;

import base.BaseClass;
import pages.LoginPage;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	
	@Test
	public void createLead() {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName().enterPassword().clickLogin().
		crmLinkClick().clickOnLeadsTab().clickCreateLeadLink().eneterCompanyName().eneterFirstName().eneterLastName().enterPhoneNo().clickSubmitButton().
		verifyLeadPage();
	}
	
	

}
