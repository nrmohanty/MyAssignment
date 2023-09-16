package week4.day2.homeassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafguardWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println("**************"+"Open with Delay Button click result"+"*********************");
		//Wait for 2 new tabs to open
		//click on the button
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		
		//get all the windowHandles IDs
		Set<String> windowids3=driver.getWindowHandles();
		System.out.println("The window ids are " +windowids3 );
		
		//put all the ids in List array and close all the child windows
		List<String> handles3=new ArrayList<>(windowids3);
		
		for (int j =0; j < handles3.size(); j++) {
			
		System.out.println("The page title is "+driver.switchTo().window(handles3.get(j)).getTitle());
			
		}
		
		driver.switchTo().window(handles3.get(0));
		
		//get the parent page title
		String pTitle=driver.getTitle();
		System.out.println("The parent page title is "+ pTitle);
		
		System.out.println("*********************"+"Open Button click result"+"*********************");
		
		//Click and Confirm new Window Opens
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//get all the windowHandles IDs
		Set<String> windowids=driver.getWindowHandles();
		System.out.println("The window ids are " +windowids );
		
		//put all the ids in  List array
		List<String> handles=new ArrayList<>(windowids);
		
		//Move to Child window
		driver.switchTo().window(handles.get(1));
		String cTitle=driver.getTitle();
		System.out.println("The child page title is "+cTitle);
		
		if(pTitle.equals(cTitle)) {
			
			System.out.println("No New window is opened.");
		}
		else {
			
			System.out.println("New Window is opened.");
		}
		
		//Move back to parent item
		driver.switchTo().window(handles.get(0));
		
		System.out.println("*********************"+"OpenMultiple Button click result"+"*********************");
		//Find the number of opened tabs
		
		//clicking on the Open Multiple Button
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		//get all the windowHandles IDs
				Set<String> windowids1=driver.getWindowHandles();
				System.out.println("The window ids are " +windowids1 );
				
				//put all the ids in  List array
				List<String> handles1=new ArrayList<>(windowids1);
				int nooftab=handles1.size();
				
				//Validate the no of tabs
				if(nooftab>=1)
				{
					
					System.out.println("The no of opened tabs is "+nooftab);
					
				}
		
				else {
					
				System.out.println("No new tabs opened.");
				}
		
				//Move back to parent item
				driver.switchTo().window(handles1.get(0));
				
				System.out.println("*********************"+"Close Windows Button click result"+"*********************");
				//Close all windows except Primary
				//Click on the Close window button
				driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
				
				//get all the windowHandles IDs
				Set<String> windowids2=driver.getWindowHandles();
				System.out.println("The window ids are " +windowids2 );
				
				//put all the ids in List array and close all the child windows
				List<String> handles2=new ArrayList<>(windowids2);
				for (int i = handles2.size()-1; i >0; i--) {
					
					driver.switchTo().window(handles2.get(i)).close();
					
				}
				
				
		
	}
	
	
}
