package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownCeck {

	public static void main(String[] args) {
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
		
		//Description field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is my 1st SeleniumProgramme");
		
		//Select STate/Provience
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec4=new Select(state);
		sec4.selectByVisibleText("New York");
		
		//select the source dropdown
		WebElement dropdown=driver.findElement(By.id("createLeadForm_dataSourceId"));
		//Instantiate a class
		Select sec=new Select(dropdown);
		
		//Select the option by Index value
		sec.selectByIndex(1);
		
		//Marketting Campaign
		WebElement mktc=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec1=new Select(mktc);
		//if value attribute is there
		sec1.selectByValue("CATRQ_CARNDRIVER");
		
		//Industry
		WebElement indust=driver.findElement(By.id("createLeadForm_industryEnumId"));
		//Instantiate the Object of Select class
		Select sec2=new Select(indust);
		//select Non-Profit  if there is any text is there.
		sec2.selectByVisibleText("Computer Software"); //we have select the black color text
		
		//Click on the Create Lead button
		driver.findElement(By.name("submitButton")).click();
		
	}

}
