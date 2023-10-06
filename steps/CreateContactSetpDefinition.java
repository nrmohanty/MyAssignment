package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateContactSetpDefinition extends BaseClass {
	
	@And("Click on Contacts tab")
	public void click_on_contacts_tab() {
		driver.findElement(By.xpath("(//a[contains(text(),'Contacts')])[1]")).click();
	}

	@And("Click on Create Contact Link")
	public void click_on_create_contact_link() {
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
	}

	@And("Enter the first name as {string}")
	public void enter_the_first_name_as(String fname) {
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys(fname);
	}

	@And("Enter the last name as {string}")
	public void enter_the_last_name_as(String lname) {
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Mohanty");
	    
	}

	@When("Cick on Create Contact button")
	public void cick_on_create_contact_button() {
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	}

	@Then("Validate the view contact page with contact name as {string}")
	public void validate_the_view_contact_page(String name) {
		
		String viewname=driver.findElement(By.xpath("//span[@id='viewContact_fullName_sp']")).getText();
		if (viewname.contains(name)) {
			
			System.out.println("View contact name matched with the created contact name");
					
		}
		else {
			System.out.println("View contact name is not  matched with the created contact name");
		}
	}

}
