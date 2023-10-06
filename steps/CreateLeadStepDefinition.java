package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends BaseClass {
		
	@When("Click on crmsfa link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.partialLinkText("CRM")).click();
	}

	@When("Click on Leads Link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click CreateLead Link")
	public void click_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter the companyname as (.*)$")
	public void enter_the_companyname_as_test_leaf(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}

	@Given("Enter the firstname as (.*)$")
	public void enter_the_firstname_as_subraja(String uname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(uname);
	}

	@Given("Enter the lastname as (.*)$")
	public void enter_the_lastname_as_s(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("ViewLeadsPage should be displayed as (.*)$")
	public void view_leads_page_should_be_displayed(String cname) {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cname)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}

}
