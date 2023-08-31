package week2.day1.homeassignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/select.xhtml");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//Which is your favorite UI Automation tool?
	WebElement tooldropdown=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	Select sec1=new Select(tooldropdown);
	sec1.selectByVisibleText("Selenium");
	
	//Choose your preferred country as India
	
	driver.findElement(By.xpath("//div[contains(@id,'country')]")).click();//click on the Combo box 
	driver.findElement(By.xpath("//div[contains(@id,'country')]//li[4]")).click();//click on the element
	
	Thread.sleep(3000);
	
	//select the city as Chennai from the City combo box
	driver.findElement(By.xpath("//label[text()='Select City']")).click();
	driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	
	//selecting course
	driver.findElement(By.xpath("//button[contains(@class,'ui-button-icon-only')]")).click();
	driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
	
	//select the language
	driver.findElement(By.xpath("//label[text()='Select Language']")).click();
	driver.findElement(By.xpath("//li[text()='English']")).click();
	
	Thread.sleep(3000);
	//Select 'Two' irrespective of the language chosen
	driver.findElement(By.xpath("//label[text()='Select Values']")).click();
	driver.findElement(By.xpath("//li[text()='Three']")).click();
	
}
}