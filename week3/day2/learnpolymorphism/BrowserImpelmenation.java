package week3.day2.learnpolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserImpelmenation implements Browser {

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

	


}
