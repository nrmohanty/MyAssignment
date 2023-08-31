package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathConcept {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize window
		driver.manage().window().maximize();
		//to get the ttitle of the current window
		
		//locate the user name
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		
		
		//Enter the Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//click on the login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//Click on CRM/SFA
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		//click on the Leads 
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		
	}
	
	

}
