package week6.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//find table
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']//following::table[2]/tbody"));
		//to find the number of rows
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println("The no: of rows in this table are :" +rowCount);
		//find column size
		List<WebElement> columns = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']//following::table[2]//th"));
		int columnCount = columns.size();
		System.out.println("The no: of columns in this table are :" +columnCount);
		System.out.println("======================================================");
		//single data
		String text = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']//following::table[2]/tbody/tr[4]/td[3]")).getText();
		System.out.println(text);
		System.out.println("======================================================");
		//find a particular row data
		List<WebElement> thirdRowData = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']//following::table[2]/tbody/tr[3]/td"));
		for (WebElement eachData : thirdRowData) {
			System.out.println(eachData.getText());
		}
		System.out.println("======================================================");
		//to print country names
		List<WebElement> countries = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']//following::table[2]/tbody/tr/td[2]"));

		for (WebElement eachCountry : countries) {

			System.out.println(eachCountry.getText());

		}

		//to get all the data of the table
		for (int i = 1; i < rowCount; i++) {

			for (int j = 0; j <columnCount; j++) {

				List<WebElement> allrowsData=driver.findElements(By.xpath("//span[text()='Customer Analytics Table']//following::table[2]/tbody/tr["+i+"]/td["+j+"]"));
				for (WebElement all : allrowsData) {

					System.out.println(all.getText());

				}
			}

		}


	}

}




