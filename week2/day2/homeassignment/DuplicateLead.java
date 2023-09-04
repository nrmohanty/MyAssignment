package week2.day2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
		
		//Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		//Enter Email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("zxcv@abc.com");
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		//Capture name of First Resulting lead
		String linkname=driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]//a[@class='linktext'])[1]")).getText();
		System.out.println("The lead id to be deleted is "+linkname );	
		
		//Clicking on the first Lead id 
		 driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]//a[@class='linktext'])[1]")).click();
		 
		 String Capturedfirstname=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		 String capturedlastname=driver.findElement(By.xpath("//span[@id='viewLead_lastName_sp']")).getText();
		 
		 
		 
		
		//Click on the Duplicate Lead link
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 
		 //Verify the title as 'Duplicate Lead'
		 String title=driver.getTitle();
		
		 if(title.contains("Duplicate Lead")) {
			 
			 System.out.println("The page Title is "+title);
		 }
		 else {
			 
			 System.out.println("Title not matched");
		 }
		
		 //click on Create Lead
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 
		 //Confirm the duplicated lead name is same as captured name
		 //get the First Name 
		 String duplicatefirstname=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		 String dupliactedlastname=driver.findElement(By.xpath("//span[@id='viewLead_lastName_sp']")).getText();
		 
		 if(Capturedfirstname.equals(duplicatefirstname) && (capturedlastname.equals(dupliactedlastname))) {
			 
			 System.out.println("Both Captured and Duplicated names are equal");
			 System.out.println("Captured name is " + Capturedfirstname + " "+capturedlastname);
			 System.out.println("Duplicated name is " + duplicatefirstname + " "+dupliactedlastname);
		 }
		 else {
			System.out.println("Captured & Duplicated Leads names are notequal");
		}
		
		 //close the Browser
		 driver.close();
		 
	}
	
	

}
