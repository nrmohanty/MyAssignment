package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MergeLeadPage extends BaseClass {
public MergeLeadPage(ChromeDriver driver) {
		
		this.driver=driver;
	}
   
public FindLeadPage clickOnFromImgLookup() {
	
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	Set<String> allWindows = driver.getWindowHandles();
	List<String> allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(1));
	return new FindLeadPage(driver);
}

public FindLeadPage clickOnToImgLookup() {
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	Set<String> allWindows2 = driver.getWindowHandles();
	List<String> allhandles2 = new ArrayList<String>(allWindows2);
	driver.switchTo().window(allhandles2.get(1));
	return new FindLeadPage(driver);

}

public MyLeadsPage clickonMergeButton() {
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	driver.switchTo().alert().accept();
	return new MyLeadsPage(driver);

}

public MergeLeadPage switchfromFromLookupToMergePage() {
	Set<String> allWindows = driver.getWindowHandles();
	List<String> allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(0));
	return this;

}

public MergeLeadPage switchfromToLookupToMergePage() {
	Set<String> allWindows2 = driver.getWindowHandles();
	List<String> allhandles2 = new ArrayList<String>(allWindows2);
	driver.switchTo().window(allhandles2.get(0));
	return this;

}

}
