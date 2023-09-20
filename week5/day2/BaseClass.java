package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public ChromeDriver driver;
	
	@BeforeMethod
	public void precondition() {
		driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//locate the user name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Check the Partial link text
		driver.findElement(By.partialLinkText("CRM")).click();
		
		
	}
	
	@AfterMethod
public void postcondition() {
		
		driver.quit();
	}

}
