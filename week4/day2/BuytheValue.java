package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuytheValue {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://buythevalue.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath(null));
		
		
	}

}
