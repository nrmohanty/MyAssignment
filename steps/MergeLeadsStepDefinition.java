package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLeadsStepDefinition extends BaseClass{
	
	@And("Click on Merge leads Link")
	public void click_on_merge_leads_link() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}

	@When("Click on From Lookup Image")
	public void click_on_from_lookup_image() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}

	@Then("Switch to FindLeads popup window for FromLookup")
	public void switch_to_find_leads_popup_window_for_from_lookup() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	}

	@And("Enter the first name as {string} for FromLookup")
	public void enter_the_first_name_as_for_from_lookup(String fname) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
	}

	@And("Click on Find leads button for FromLookup")
	public void click_on_find_leads_button_for_from_lookup() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadID);
	}

	@When("Cick on First Searched Lead Link for FromLookup")
	public void cick_on_first_searched_lead_link_for_from_lookup() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@Then("Switch to Merge Leads page from FromLookup popup window")
	public void switch_to_merge_leads_page_from_from_lookup_popup_window() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
	}

	@When("Click on To Lookup Image")
	public void click_on_to_lookup_image() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}

	@Then("Switch to FindLeads popup window for ToLookup")
	public void switch_to_find_leads_popup_window_for_to_lookup() {
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
	}

	@Then("Enter the first name as {string} for ToLookup")
	public void enter_the_first_name_as_for_to_lookup(String fname) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
	    
	}

	@And("Click on Find leads button for ToLookup")
	public void click_on_find_leads_button_for_to_lookup() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@And("Cick on First Searched Lead Link for ToLookup")
	public void cick_on_first_searched_lead_link_for_to_lookup() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@Then("Switch to Merge Leads page from ToLookup popup window")
	public void switch_to_merge_leads_page_from_to_lookup_popup_window() {
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(0));
	}

	@When("Click on Merge Button and Accept the Alert")
	public void click_on_merge_button_and_accept_the_alert() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
	}

	
	@Then("Verify the Mergred Lead is not shown in FindLeads searched action.")
	public void verify_the_mergred_lead_is_not_shown_in_find_leads_searched_action() throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	   
	}

}
