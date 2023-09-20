package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		Alert simpleAlert=driver.switchTo().alert();
		String alertMessage=simpleAlert.getText();
		
		System.out.println(alertMessage);
		Thread.sleep(0);
		simpleAlert.accept();
		
		String successmessage=driver.findElement(By.id("simple_result")).getText();
		if (successmessage.contains("success")) {
			System.out.println("Alert is handled");
			
		} 		
		
		
	}

}
