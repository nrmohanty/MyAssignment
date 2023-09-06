package week3.day1.inheritance;

public class Auto  extends Vehicle{

	private void applyMeter() {
		System.out.println("Apply meter");

	}
	
	public static void main(String[] args) {
		
		Auto auto=new Auto();
		auto.applyBreak();
		auto.applyMeter();
		auto.soundHorn();
	}
}
