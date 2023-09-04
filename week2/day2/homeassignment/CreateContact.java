package week2.day2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		driver.findElement(By.linkText("Contacts")).click();
		
		
		//Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		
		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Nihar1");
		
		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Nihar1_firstname_local");
		
		//Enter the Last Name
		driver.findElement(By.id("lastNameField")).sendKeys("Nihar1_Lastname");
		
		//Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Nihar1_lastname_local");
		
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mechanical");
		
		//Enter Description Field Using any Locator of your choice
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("This is my Description");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("niahr.email@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text
		WebElement state=driver.findElement(By.xpath("//select[contains(@id,'StateProvince')]"));
		Select sel=new Select(state);
		sel.selectByVisibleText("New York");
		
		//Click on Create Contact
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Click on edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Clear the Description Field using .clear
		driver.findElement(By.xpath("//textarea[contains(@id,'description')]")).clear();
		
		//Fill ImportantNote Field with Any text
		driver.findElement(By.xpath("//textarea[contains(@id,'importantNote')]")).sendKeys("This is important note");
		
		//Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		//Get the Title of Resulting Page.
		System.out.println(driver.getTitle());
		
	
}
}