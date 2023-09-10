package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrice {
	public static void main(String[] args) {
		
		
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Go to the search box
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile",Keys.ENTER);
				
		//get the prices
	List<WebElement> price=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	
	//Declare a list
			List<Integer> list=new ArrayList<>();
			
			//Data type variable : data
			for (WebElement each: price) {
				String text=each.getText();
				String replaceString=text.replaceAll(",","");
				int mobileprices=Integer.parseInt(replaceString);
				list.add(mobileprices);
									
			}
			
			//to print unique price
			
			Set<Integer> unique=new TreeSet<>(list);
			if (list.size()!=unique.size()) {
				System.out.println("Duplicate present");
				
			}
			
			else {
				
				System.out.println("No Duplicate");
			}
			
			System.out.println(unique);
			
			List<Integer> alllist=new ArrayList<>(unique);
			System.out.println(alllist.get(0));
			
			
			
				
			//to sort
			Collections.sort(list);
			
			System.out.println(list.get(0));
		
		
		
	}

}
