package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class FindLeadPage extends BaseClass {
   public FindLeadPage(ChromeDriver driver) {
		
		this.driver=driver;
	}
   
		
	public FindLeadPage enterPhoneNo() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		return this;
		
	}
	
	public FindLeadPage enterFromLookupFirstName() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Bala");
		return this;
	}
	
	public FindLeadPage enterToLookupFirstName() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Jane");
		return this;
	}
	
		
	public FindLeadPage clickOnFindLeadsbutton() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}

	
	
	public ViewLeadPage clickOnFirstSearchedLink() throws InterruptedException {
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadID);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);
		
	}
	public MergeLeadPage clickOnFirstSearchedLinkPopUpMerge() throws InterruptedException {
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadID);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new MergeLeadPage(driver);

	}
	
	
	public FindLeadPage validateDeletedLeadID(String leadID) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Lead deleted successfully");
		} else {
			System.out.println("Lead is not deleted ");
		}
		
return this;
}
	
	public FindLeadPage validateMergeLead(String leadID) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		return this;
	}
	
	
}