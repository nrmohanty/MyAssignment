package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoom_Activity1 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert simpleAlert=driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		simpleAlert.accept();
		String successmessage=driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		if(successmessage.contains("OK")) {
			
			System.out.println("Alert message is accepted");
		}
		
		
		
		
		
		
		
		
	}

}
