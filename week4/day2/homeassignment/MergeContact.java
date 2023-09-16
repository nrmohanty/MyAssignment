package week4.day2.homeassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		// Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		

		//maximize window
		driver.manage().window().maximize();
		
		//Imlpicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Enter User Name & Password using id locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on CRM/SFA Link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		// Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//get Window handle
		 String pwindowHandle = driver.getWindowHandle();
		 
		//get the title of the parent  window
			String pTitle=driver.getTitle();
			System.out.println(pTitle);
		 
		
		//Click on Widget of From Contact
		driver.findElement(By.xpath("//a[contains(@href,'partyIdFrom')]")).click();
		
						
		//to get all window handles
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
				
		//to switch to child window
		List<String> handles=new ArrayList<>(windowHandles);
		driver.switchTo().window(handles.get(1));
		
		//get the title of the child window
		String cTitle=driver.getTitle();
		System.out.println(cTitle);
		
		Thread.sleep(2000);
		
		//Click on First Resulting Contact in the From Contact window
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner')]/a[@class='linktext'])[1]")).click();
			
		
		//switch back to parent window
		driver.switchTo().window(handles.get(0));
		//driver.switchTo().window(pwindowHandle);
		
		Thread.sleep(2000);
		
		//Click on the To Contact Widget
		driver.findElement(By.xpath("//a[contains(@href,'partyIdTo')]")).click();
				
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println(windowHandles1);
				
		//to switch to child window
		List<String> handles1=new ArrayList<>(windowHandles1);
		driver.switchTo().window(handles1.get(1));
		
				
		//to switch to child winodw
       driver.switchTo().window(handles1.get(1));
		
		//get the title of the child window
		String c2Title=driver.getTitle();
		System.out.println(c2Title);
		
		
		
		//Click on First Resulting Contact in the To Contact window
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner')]/a[@class='linktext'])[1]")).click();
		
		//switch back to parent window
		driver.switchTo().window(handles1.get(0));
		//driver.switchTo().window(pwindowHandle);
				
		
		//Click on Merge Table
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		//Get the Alert message
		
		Alert getAlert=driver.switchTo().alert();
		System.out.println("Alert message is "+getAlert.getText());
		
		//Accept the alert
		getAlert.accept();
		
		//get the page Title
		System.out.println("The page title is "+driver.getTitle());
			
		
	}
	
	

}
