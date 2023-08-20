package week1.day1;

public class LaunchSwitchCondition {
	public static void main(String[] args) {
		String browser="chrome";
		switch (browser) {
		case "chrome":System.out.println("Open chrome browser");break;
		case "Edge":System.out.println("Open Edge browser");break;
		case "IE":System.out.println("Open IE browser");break;
		case "Firefox":System.out.println("Open Firefox browser");break;
		default:System.out.println("Open Opera browser");break;
		}
	}

}
