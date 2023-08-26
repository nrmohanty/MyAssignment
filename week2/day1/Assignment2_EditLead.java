package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_EditLead {
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize window
		driver.manage().window().maximize();
		//to get the ttitle of the current window
		
		//locate the user name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Check the Partial link text
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nihar");
		
		//lastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mohanty");
		
		//Local First Name
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("NIhar");
		
		//Enter Department Field
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		//Enter the email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nihartest@gmail.com");
		Thread.sleep(2000);
		
		//Description field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is my 1st SeleniumProgramme");
		
		//Select STate/Provience
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec4=new Select(state);
		sec4.selectByVisibleText("New York");
		
		//Click on the Create Lead button
		driver.findElement(By.name("submitButton")).click();
		
		//Edit the Lead
		driver.findElement(By.linkText("Edit")).click();
		
		//Clear the description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//Writing sometext in Important Note text field
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is Important Note");
		
		//Clicking on the Create button
		driver.findElement(By.name("submitButton")).click();
		
		//get the page title
		System.out.println(driver.getTitle());


}
}