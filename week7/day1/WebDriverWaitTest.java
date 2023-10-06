package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitTest {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/waits.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		boolean btext = driver.findElement(By.xpath("//span[text()='I am about to hide']")).isDisplayed();
		System.out.println(btext);
		
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[text()='I am about to hide']"))));
		
		boolean atext = driver.findElement(By.xpath("//span[text()='I am about to hide']")).isDisplayed();
        System.out.println(atext);
        	
        }
		
		
	}
	
	

