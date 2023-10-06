package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewContactPage extends BaseClass{
	
public ViewContactPage(ChromeDriver driver) {
		
		this.driver=driver;
	}

public void validateViewContact() {
	
	String viewname=driver.findElement(By.xpath("//span[@id='viewContact_fullName_sp']")).getText();
	if (viewname.contains("Nihar Mohanty")) {
		
		System.out.println("View contact name matched with the created contact name");
				
	}
	else {
		System.out.println("View contact name is not  matched with the created contact name");
	}
}

}
