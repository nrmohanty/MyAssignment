package week3.day1.inheritance;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import week3.day1.Browser;
import week3.day1.Element;
import week3.day1.Reporter;

public class BrowserImpelmenation extends Reporter implements Browser,Element {

public RemoteWebDriver driver;	
@Override
	public void startApp() {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
			
	}

public void startApp(String browser) {
	// TODO Auto-generated method stub
	
	switch (browser) {
	case "chrome":
		driver=new ChromeDriver();
		break;
	case "edge":
		driver=new EdgeDriver();
		break;
	case "firefox":
		driver=new FirefoxDriver();	
	default:
		break;
	}
		
}

	@Override
	public void loadURL(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
		
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		driver.close();
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	
public static void main(String[] args) {
	BrowserImpelmenation bi=new BrowserImpelmenation();
	bi.startApp();
	bi.loadURL("");
	bi.close();
	bi.takeSnap();
	bi.locate();
		
	}

@Override
public void locate() {
	// TODO Auto-generated method stub
	System.out.println("locate");
	
}

@Override
public void takeSnap() {
	// TODO Auto-generated method stub
	
	System.out.println("snap taken");
	
}
}
