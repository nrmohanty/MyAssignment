package week7.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
public static void main(String[] args) throws IOException {
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions builder=new Actions(driver);
	builder.contextClick(rightclick).perform();
	driver.findElement(By.xpath("//li[contains(@class,'context-menu-icon-edit')]")).click();
	driver.switchTo().alert().accept();
	
	
	File src=driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("./snap/drag.png");
	FileUtils.copyDirectory(src, dest);
	
	
}
}
