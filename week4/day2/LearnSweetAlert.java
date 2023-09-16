package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']/following::span")).click();
		
		

	}
	
	
}
