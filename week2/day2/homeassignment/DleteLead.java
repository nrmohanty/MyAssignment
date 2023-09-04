package week2.day2.homeassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DleteLead {
	
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
		
		//Click crm/sfa lin
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Find leads link from left menu
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		//Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//Enter the phone number 32 467 652414
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8610166012");
		
		//Click on Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Capture lead ID of First Resulting lea
		Thread.sleep(2000);
				
		String linkname=driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]//a[@class='linktext'])[1]")).getText();
		System.out.println("The lead id to be deleted is "+linkname );	
		
		//Clicking on the first Lead id 
		 driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]//a[@class='linktext'])[1]")).click();
				
		//Click Delete
		driver.findElement(By.linkText("Delete")).click();
		
		
		//Click Find leads link from left menu
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		//Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(linkname);
		
		//Click on the Find Lead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		//get the No records message
		System.out.println(driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText());
		
		//close the browser
		
		driver.close();
		
		
	}
	
	
	

}
