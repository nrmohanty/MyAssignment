package week6.day2;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class classroomAssignment2 extends BaseClass {
	@BeforeTest
	public void setValues() {
		
		ExcelFileName="MakeMyTripCityDetail";
	}
	
	@Test(dataProvider="fetchData")
	public void makeMyTripHotelBookingCheck(String fromCity,String toCity) throws Exception {

		//closing the close button
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();

		//4. Navigate to the "Holiday Packages" section.
		driver.findElement(By.xpath("//span[text()='Holiday Packages']")).click();

		//5. Input "Chennai" as the departure city.
		driver.findElement(By.xpath("//span[@data-cy='fromCity']/following::input")).click();
		WebElement citytext=driver.findElement(By.xpath("//input[@placeholder='Enter City']"));
		Thread.sleep(2000);
		citytext.clear();
		citytext.sendKeys(fromCity);

		//6. Select the first suggested city.
		driver.findElement(By.xpath("//span[@class='appendLeft8 blackText']")).click();


		//7. Specify "Goa" as the destination city.
		driver.findElement(By.xpath("//span[@data-cy='toCity']/following::input")).click();
		WebElement tocity=driver.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(2000);
		tocity.clear();
		tocity.sendKeys(toCity);

		//8. Choose the first city suggestion.
		driver.findElement(By.xpath("(//div[@class='dest-city-name'])[2]")).click();

		//9. Pick a date from the calendar.
		driver.findElement(By.xpath("//div[@aria-label='Thu Sep 28 2023']")).click();

		//10. Adjust the number of adults to the maximum allowed.
		//driver.findElement(By.xpath("//p[contains(@class,'empty-pax-text')]")).click();

		Thread.sleep(2000);
		//adding Adult
		driver.findElement(By.xpath("//div[@data-testid='adult-increment-counter']")).click();


		Thread.sleep(2000);

		//adding Child
		driver.findElement(By.xpath("//div[@data-testid='child-increment-counter']")).click();

		Thread.sleep(2000);

		//select the age of the child
		driver.findElement(By.xpath("//li[@class='children-age-wrapper']/ul/li[5]")).click();

		//11. Click on the apply button.
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();

		//click on the Filter
		//driver.findElement(By.xpath("//div[@class='applied-filters-string']")).click();


		//12. Set the trip duration to 3-5 nights.

		//select the slider
		WebElement element=driver.findElement(By.xpath("//div[@class='rc-slider-step']/following::div[1]"));


		Actions act=new Actions(driver);
		act.dragAndDropBy(element, 100,300).perform();
		
		//13. Click on the apply button
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();

		//14.Click on the Search option
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		
		Thread.sleep(2000);
		
		//15. Skip an automated assistance prompt.
		//driver.findElement(By.xpath("//button[text()='SKIP']")).click();
		
		//16. Capture a screenshot of the first vacation package.		
		takeSnapShot(driver, "C://Users//nm34448//SeleniumScreenshots//screenshot.jpeg");
		
		//17. Print the current page title.
		System.out.println(driver.getTitle());
		
			
		
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
