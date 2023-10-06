package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class EditLead extends BaseClass {

	@Test
	public void editLead() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName().enterPassword().clickLogin().crmLinkClick().clickOnLeadsTab().findLeads().enterPhoneNo().clickOnFindLeadsbutton().clickOnFirstSearchedLink()
		.clickOnEditButton().updateCompanyName().clickOnUpdateButton().validateChangedCompanyName();
	}
}