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

public class ScrollDown {
public static void main(String[] args) throws IOException {
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement bottomlink=driver.findElement(By.xpath("//a[text()='AbeBooks']"));
	
	Actions builder=new Actions(driver);
	
	builder.scrollToElement(bottomlink).perform();
	System.out.println(bottomlink.getText());
	
	File src=driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("./snap/amazon.png");
	FileUtils.copyFile(src, dest);
	
	
}
}
