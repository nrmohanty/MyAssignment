package week4.day2.homeassignment;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAssignment {
	

	public static void main(String[] args) throws Exception {
		//Opening the ChromeBrowser
		ChromeDriver driver=new ChromeDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Opening the Amazon URL
		driver.get("https://www.amazon.in/");
		//Click on the search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
		//get the title of the Parent window
		String pwindowhandle=driver.getWindowHandle();
		String ptitle=driver.getTitle();
		System.out.println("Parent window title" +ptitle );
		
		
		//get the price of the 1st product
		String price=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		String pwocomma=price.replaceAll(",","");
		System.out.println("The price of the 1st Product is "+pwocomma);
		
		Thread.sleep(3000);
		
		//Print the number of customer ratings for the first displayed product
		String crating=driver.findElement(By.xpath("(//div[@class='a-row a-size-small']//span)[1]")).getAttribute("aria-label");
		System.out.println("Customer rating is "+crating);
		
		//Click the first text link of the first image
		driver.findElement(By.xpath("(//a[contains(@class,'s-link-style')])[1]")).click();
		
		//get all the Window Ids
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("The window ids are "+windowHandles);
		
		//Putting all the ids into an array
		List<String> handles=new ArrayList<>(windowHandles);
		
		//switch to child window
		driver.switchTo().window(handles.get(1));
		
		
		//Take a screen shot of the product displayed
		takeSnapShot(driver, "C://Users//nm34448//SeleniumScreenshots//screenshot.jpeg");
		
			 
		
		//Click 'Add to Cart' button
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		Thread.sleep(3000);
		
		
		//get all the Window Ids
				Set<String> windowHandles1 = driver.getWindowHandles();
				System.out.println("The window ids are "+windowHandles1);
				
				//Putting all the ids into an array
				List<String> handles1=new ArrayList<>(windowHandles1);
				
				//switch to child window
				driver.switchTo().window(handles1.get(1));
		
				Thread.sleep(7000);
				
						
		//Get the cart sub-total and verify if it is correct.
		String cartsubtotal=driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		//replacing the Rs symbol
		String cartsubtotal1=cartsubtotal.replaceAll("₹","");
		
		//replacing the comma with empty space from the price.
		String cartsubtotal2=cartsubtotal1.replaceAll(",", "");
		String cartsubtotal3=cartsubtotal2.replaceAll(".00","");
		System.out.println("The cart subtotal is "+ cartsubtotal3);
		
		if (cartsubtotal3.equals(pwocomma)) {
			
			System.out.println("Cart subtotal & Cart Price are equal");
			
		}
		else 
		{
			System.out.println("Cart subtotal & Cart Price are different");
			
		}
		
		//close the browser
		driver.quit();
			
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		}

}
