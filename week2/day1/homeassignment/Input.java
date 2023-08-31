package week2.day1.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		
		//Type your name
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Nihar Mohanty");
		
		//Append Country to this City.
		driver.findElement(By.id("j_idt88:j_idt91")).clear();
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Chennai");
		
		//Verify if text box is disabled
		boolean fielddisabled=driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println(fielddisabled);
		if(fielddisabled==true) {
			
			System.out.println("Text box is enabled");
		}
		else {
			
			System.out.println("Text box is disabled");
			
		}
		
		//Clear the typed text.
		System.out.println(driver.findElement(By.id("j_idt88:j_idt95")).getText());
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
				
		//Retrieve the typed text.
		System.out.println(driver.findElement(By.id("j_idt88:j_idt97")).getText());
		
		//Type email and Tab. Confirm control moved to next element.
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("nihar@gmail.com");
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys(Keys.TAB);
		
		//check the next element is enabled or not
		System.out.println(driver.findElement(By.id("j_idt88:j_idt101")).isEnabled());
		
		//Type about yourself
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("This is Nihar");
		
		Thread.sleep(2000);
		
		//Text Editor
		//driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']/div[1]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']/div[1]")).sendKeys("This is my first Edit box");
		
		//Just Press Enter and confirm error message*
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		String Errormessage=driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText();
		System.out.println("The error displayed on the page is "+Errormessage);
		
		//Click and Confirm Label Position Changes
		Point beforeclick=driver.findElement(By.xpath("//input[@id='j_idt106:float-input']/following-sibling::Label")).getLocation();
		System.out.println("The position of the label before click"+beforeclick);
		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
		Point afterclick=driver.findElement(By.xpath("//input[@id='j_idt106:float-input']/following-sibling::Label")).getLocation();
		System.out.println("The position of the label before click"+afterclick);
		
		//Type your name and choose the third option
		driver.findElement(By.xpath("//input[contains(@id,'j_idt106:auto-complete_input')]")).sendKeys("username");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[contains(@class,'ui-autocomplete-multiple-container ui-autocomplete-dd-multiple-container')]/following::span[text()='username'])[3]")).click();
		
		//Type your DOB (mm/dd/yyyy) and confirm date chosen
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']")).sendKeys("07/06/2000");
		boolean datedisplayed=driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-widget')]/following::a[text()[normalize-space()='6']]")).isDisplayed();
		System.out.println("The date is selected in Calander "+datedisplayed);
		
		//Type number and spin to confirm value changed
		String passnumber="1";
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).sendKeys(passnumber);
		driver.findElement(By.xpath("//span[contains(@class,'ui-icon-triangle-1-n')]")).click();
		Thread.sleep(2000);
		String shownnumber=driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).getAttribute("aria-valuenow");
		if(passnumber.equals(shownnumber)) {
			
		System.out.println("The numbers are equal"+ shownnumber);
			
		}
		else {
			
			System.out.println("The numbers are not equal as passed number is "+ passnumber + " and "+"the display number is "+shownnumber);
			
		}
		
		
		
		//Type random number (1-100) and confirm slider moves correctly
		String beforeTypedNo=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui-corner-all ui-state-default')]")).getAttribute("style");
		driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("10");
		String afterTypedNo=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui-corner-all ui-state-default')]")).getAttribute("style");
		
		System.out.println("slider position "+ beforeTypedNo);
		System.out.println("slider position "+ afterTypedNo);
		
			
		//Click and Confirm Keyboard appears
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).click();
		System.out.println("Keyboard is displayed "+driver.findElement(By.xpath("//div[contains(@class,'keypad-popup')]")).isDisplayed());
		
		//Custom Toolbar
		driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']/div[1]")).sendKeys("This is custom tool bar editing box");
		
	}

}
