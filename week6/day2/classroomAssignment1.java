package week6.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classroomAssignment1 {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement fromstn=driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		fromstn.clear();
		fromstn.sendKeys("MS",Keys.ENTER);
		
		WebElement tostn=driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		tostn.clear();
		tostn.sendKeys("CAPE",Keys.ENTER);
		
		//uncheck sort on date
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		//get the list of table
		WebElement table=driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		
		//find data names
				List<WebElement> trainNames=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]"));
				for (WebElement eachName : trainNames) {
					
					System.out.println(eachName.getText());
				}
					
				}
				
		
		
		
	}


