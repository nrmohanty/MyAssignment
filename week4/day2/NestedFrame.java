package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/frame.xhtml");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//switch to parent iframe	
	Thread.sleep(2000);
	WebElement framele=driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following::iframe"));
	driver.switchTo().frame(framele);
	
	//switch to child iframe
	driver.switchTo().frame(0);
	//click on the click button
	driver.findElement(By.id("Click")).click();
	//check the text
	driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
	
	
	
}
}
