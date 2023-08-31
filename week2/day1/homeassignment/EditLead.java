package week2.day1.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EditLead {
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
		
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Find leads link from left menu
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		//Enter first name
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Nihar");
		
		//Click Find leads button
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//Click on first resulting lead
		driver.findElement(By.xpath("//a[contains(text(),'14040')]")).click();
		
		//Verify title of the page
		System.out.println(driver.getTitle());
		
		//Click Edit
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		
		//Change the company name
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("Likewize");  //need to ask how to get the value again
		
		
		//Click Update
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//Confirm the changed name appears
		String displayedCompanyName=driver.findElement(By.xpath("//span[contains(@id,'companyName')]")).getText();
		
		System.out.println(displayedCompanyName.contains("Likewize"));
		
		//Close the browser (Do not log out)
		driver.close();
		
		
		
}
}