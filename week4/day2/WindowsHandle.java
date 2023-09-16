package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/window.xhtml");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.xpath("//span[text()='Open']")).click();
	//get the title of the parent window
	
	String pTitle=driver.getTitle();
	System.out.println(pTitle);
	//get Window handle
	String pwindowHandle = driver.getWindowHandle();
	//to get all window handles
	Set<String> windowHandles = driver.getWindowHandles();
	//to switch to particular winodw
	
	List<String> handles=new ArrayList<>(windowHandles);
	driver.switchTo().window(handles.get(1));
	
	
	for (String each : windowHandles) {
		System.out.println(each);
	}
	
	//get the title of the child window
	String cTitle=driver.getTitle();
	System.out.println(cTitle);
	
	
	if (!pTitle.equals(cTitle)) {
		System.out.println("Control switched to new window");
		
	} else {
		
		System.out.println("Control not switched to new window");
	}
}
	
}
