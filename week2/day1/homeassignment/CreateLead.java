package week2.day1.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeDriver driver=new ChromeDriver(); 
	driver.get("http://leaftaps.com/opentaps/control/main");
	//maximize window
	driver.manage().window().maximize();
	
	
	//locate the user name
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	
	//Enter the Password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	//click on the login button
	driver.findElement(By.className("decorativeSubmit")).click();
	
	//Check the Partial link text
	driver.findElement(By.partialLinkText("CRM")).click();
	
	//click on Lead button 
	
	driver.findElement(By.linkText("Leads")).click();
	
	//click on Create Lead button
	driver.findElement(By.linkText("Create Lead")).click();
	
	//company Name
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	
	//first name
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nihar");
	
	//lastName
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mohanty");
	
				
	//Select value as Employee in Source Using SelectbyVisible text
	WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select sec=new Select(source);
	sec.selectByVisibleText("Employee");
	
	//Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
	WebElement mktgCampaign=driver.findElement(By.xpath("//select[contains(@id,'CampaignId')]"));
	Select sec1=new Select(mktgCampaign);
	sec1.selectByValue("9001");
	
	//Select value as Corporation in OwnerShip field Using SelectbyIndex
	WebElement OwnerShip=driver.findElement(By.xpath("//select[contains(@id,'ownershipEnumId')]"));
	Select sec2=new Select(OwnerShip);
	sec2.selectByIndex(5);
	
	//Select value as India in Country Field Using SelectbyVisibletext
	WebElement Country=driver.findElement(By.xpath("//select[contains(@id,'CountryGeoId')]"));
	Select sec3=new Select(Country);
	sec3.selectByVisibleText("India");
	
	//Click on the Create Lead button
	driver.findElement(By.name("submitButton")).click();
	
	//get the page title
	System.out.println(driver.getTitle());
	
}
}