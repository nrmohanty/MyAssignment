package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//to find the links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		//to print the no of links
		System.out.println("total no of links are " +links.size());
		
		//to retrieve the 2nd element
		WebElement secondlink=links.get(2);
		String linkname=secondlink.getText();
		System.out.println(linkname);
		
		//to print all links
		for (int i = 0; i < links.size(); i++) {
			
			System.out.println(links.get(i).getText());
			
			
			
		}
		
		//Declare a list
		List<String> list=new ArrayList<>();
		
		//Data type variable : data
		for (WebElement each: links) {
			String text=each.getText();
			list.add(text);
			
					
		}
		
		System.out.println(list);
		
		
		
		
		//to sort
		Collections.sort(list);
		System.out.println(list);
		
	}
	

}
