package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunLogin extends BaseClass{
	
	@Test
	public void runLogin() {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName()
		.enterPassword()
		.clickLogin();
	
		
	}
	

}
