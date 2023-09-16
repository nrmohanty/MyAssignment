package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConfirmAlert {
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span")).click();
		
		Alert simpleAlert=driver.switchTo().alert();
		simpleAlert.sendKeys("Nihar");
		
		String promptAlert=simpleAlert.getText();
		System.out.println(promptAlert);
		Thread.sleep(0);
		simpleAlert.accept();
		
		String successmessage=driver.findElement(By.id("confirm_result")).getText();
		if (successmessage.contains("Nihar")) {
			System.out.println("Alert is Accepeted");
			
		} 	
	}

}
