package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/frame.xhtml");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//switch to frame
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	//click on the button
	driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	
	
	
}

}
