package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrwoser {
	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nm34448\\Selenium_Jars\\chromedriver-win64\\chromedriver.exe");
		//lunch the browser
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
			
			System.out.println(driver.getTitle());
			
			//close the browser
			driver.close();
			
			
			

		
	}

}
