package week3.day1;

public abstract class Reporter implements Browser{

	public abstract void takeSnap();
	
	public void startReporter() {
		
		System.out.println("Report started");
	}
	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}
	
	
}
