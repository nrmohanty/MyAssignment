package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement iframe=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(iframe);
		WebElement doubleclick=driver.findElement(By.xpath("//p[contains(text(),'ouble-click')]"));	
		Actions builder=new Actions(driver);
		builder.doubleClick(doubleclick).perform();
		String text=driver.findElement(By.id("demo")).getText();
		System.out.println(text);
	}
	
	
}
