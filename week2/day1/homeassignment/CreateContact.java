package week2.day1.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize window
		driver.manage().window().maximize();
		
		//Enter User Name & Password using id locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on CRM/SFA Link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		// Click on contacts Button
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		
		//Click on Create Contact
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Nihar1");
		
		
		
		
		
		
		
	}

}
