package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	public RemoteWebDriver driver;
	public String ExcelFileName;
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void precondition(String browser,String url,String uName,String pWord) {
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver(); 
		}
		
		else if(browser.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
		else {
			driver=new InternetExplorerDriver();
			
		}
		driver.get(url);
		//maximize window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//locate the user name
		driver.findElement(By.id("username")).sendKeys(uName);
		
		//Enter the Password
		driver.findElement(By.id("password")).sendKeys(pWord);
		
		//click on the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Check the Partial link text
		driver.findElement(By.partialLinkText("CRM")).click();
		
		
	}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		
		return Readexcel.readExcel(ExcelFileName);
	}
	@AfterMethod
public void postcondition() {
		
		driver.quit();
	}

}
