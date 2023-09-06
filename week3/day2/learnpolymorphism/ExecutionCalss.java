package week3.day2.learnpolymorphism;

public class ExecutionCalss {
	
	public static void main(String[] args) {
		
		BrowserImpelmenation bi=new BrowserImpelmenation();
		bi.startApp();
		bi.startApp("firefox");
		bi.startApp("edge");
		bi.loadURL("http://leaftaps.com/opentaps/control/main");
		bi.close();
		
	}

}
