package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceLogin {
     public static void main(String[] args) {
    	 ChromeDriver driver=new ChromeDriver(); 
			driver.get("https://login.salesforce.com/");
			
			//maximize window
			driver.manage().window().maximize();
			//to get the ttitle of the current window
			System.out.println(driver.getTitle());
			
			//locate the user name
			driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
			
			//Enter the Password
			driver.findElement(By.id("password")).sendKeys("Leaf$1234");
			
			//click on the login button
			driver.findElement(By.id("Login")).click();
			
				
	}
     
	

}
