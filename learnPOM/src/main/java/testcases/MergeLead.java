package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class MergeLead extends BaseClass {
	
	@Test
	public void mergeLead() throws InterruptedException  {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName().enterPassword().clickLogin().crmLinkClick().clickOnLeadsTab().clickOnMergeLeadLink().clickOnFromImgLookup().
		enterFromLookupFirstName().clickOnFindLeadsbutton().clickOnFirstSearchedLinkPopUpMerge().switchfromFromLookupToMergePage().clickOnToImgLookup()
		.enterToLookupFirstName().clickOnFindLeadsbutton().clickOnFirstSearchedLinkPopUpMerge().switchfromToLookupToMergePage().clickonMergeButton().findLeads()
		.validateMergeLead(driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText());

	
}
}