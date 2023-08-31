package week2.day1.homeassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {
public static void main(String[] args) throws InterruptedException {
	
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/button.xhtml");
	//Click and Confirm title.
	driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
	System.out.println("The page title is " + driver.getTitle());
	driver.navigate().back();
	
	//Confirm if the button is disabled.
		boolean buttondisabled=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
		if(buttondisabled==true) {
			
			System.out.println("button is enabled");
		}
		else {
			System.out.println("button is disabled");
			
		}
		
		//Find the position of the Submit button
		System.out.println("position of the Submit button is "+ driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']//span[1]")).getLocation());
		
		//Find the Save button color
		String bottomcolor=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']//span[2]")).getCssValue("color");
		System.out.println("The buttom color is "+bottomcolor);
		
		//Find the height and width of this button
		String bottomheight=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']//span[2]")).getCssValue("height");
		String bottomwidth=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']//span[2]")).getCssValue("width");
		
		System.out.println("The height is "+bottomheight);
		System.out.println("The bottom width is "+bottomwidth);
		
		//Mouse over and confirm the color changed
		String colorBefore=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']//span[1]")).getCssValue("color");
		Thread.sleep(2000);
		System.out.println("The color of the button before mouse over is "+ colorBefore);
		WebElement element=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']//span[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		String colorAfter=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']//span[1]")).getAttribute("style");
		System.out.println("The color of the button after mouse over is "+ colorAfter);
		
		//Click Image Button and Click on any hidden button
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']//span[1]")).click();
		System.out.println(driver.findElement(By.xpath("//img[@id='j_idt88:j_idt102:j_idt104']")).getText());
		JavascriptExecutor js = (JavascriptExecutor) driver;
	      // identify element and set value
	      js.executeScript
	      ("document.getElementById('j_idt88:j_idt102:j_idt104').value='Testleaf';");
	      String str = (String) js.executeScript("return       document.getElementById('j_idt88:j_idt102:j_idt104').value");
	      System.out.print("Value entered in hidden element: " +str);
		
	      //get the count of rounded buttons
	     List<WebElement> roundedButtoncount=driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
	     System.out.println("the count of buttons are " + roundedButtoncount.size());
}
	
	
}
