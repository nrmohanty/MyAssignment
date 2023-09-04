package week2.day2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		//Maximise the window
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on Create New Account button
		driver.findElement(By.linkText("Create new account")).click();
		//Enter the 1st Name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nihar");
		//Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mohanty");
		//Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9886744444");
		//Enter the password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Tes@t1234");
		
		//Enter the Date of birth
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sel=new Select(day);
		sel.selectByValue("2");
		
		//Enter the Month
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sel1=new Select(month);
		sel1.selectByValue("3");
		
		//Enter the year
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select sel2=new Select(year);
		sel2.selectByValue("2010");
		
		//select the Female radio button:
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		
		
	}
	
}
