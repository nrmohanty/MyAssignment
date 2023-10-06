package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadStepDefinition extends BaseClass{
	@And("Click on Find leads Link")
	public void click_on_find_leads_link() {
		driver.findElement(By.linkText("Find Leads")).click();

	}

	@And("Click on Phone tab")
	public void click_on_phone_tab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}

	@And("Enter the phone no as {string}")
	public void enter_the_phone_no_as(String pno) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pno);

	}

	@And("Click on Find Leads button")
	public void click_on_find_leads_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}

	@And("Cick on First Searched Lead Link")
	public void cick_on_first_searched_lead_link() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}

	@And("Click on Edit Link")
	public void click_on_edit_link() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@And("Clear the text in Company Name")
	public void clear_the_text_in_company_name() {
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();

	}

	@Given("Enter the Company Name as {string}")
	public void enter_the_company_name_as(String cname) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);

	}

	@When("Click on Update Button")
	public void click_on_update_button() {
		driver.findElement(By.name("submitButton")).click();

	}

	@Then("Verify the Company Name is shown as {string} in the View Lead page.")
	public void verify_the_company_name_is_shown_as_in_the_view_lead_page(String cname) {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cname)) {
			System.out.println("Lead is editted successfully");
		}
		else {
			System.out.println("Lead is not editted");
		}



	}


}
