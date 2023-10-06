package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class DeleteLead extends BaseClass{
	
	@Test
	public void deleteLead() throws InterruptedException  {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName().enterPassword().clickLogin().crmLinkClick().clickOnLeadsTab().findLeads().enterPhoneNo().clickOnFindLeadsbutton().
		clickOnFirstSearchedLink().clickOnDeleteButton().findLeads().validateDeletedLeadID(driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText());
}
}