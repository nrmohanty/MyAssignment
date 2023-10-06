package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	
	@And("Enter the username as {string}")
	public void enterUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);

	}
	
	@And("Enter the password as {string}")
	public void enterPassword(String pword) {
		driver.findElement(By.id("password")).sendKeys(pword);

	}
	@When("Click on the Login button")
	public void clickonLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		String text=driver.findElement(By.tagName("h2")).getText();
		
		if (text.contains("Welcome")) {
			System.out.println("Welcome Page is shown");
			
		}
		else {
			
			System.out.println("login is success");
		}
		

	}
	
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		String error=driver.findElement(By.id("errorDiv")).getText();
		
		if(error.contains("errors")) {
			
			System.out.println("login failed");
		}
		

	}
	
	

}
