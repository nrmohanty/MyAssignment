package week3.day1.inheritance;

public class Bajaj extends Auto{
	
	private void selfStart() {
		// TODO Auto-generated method stub
		
		System.out.println("Self start from Bajaj auto");

	}
public static void main(String[] args) {
	Bajaj bajaj=new Bajaj();
	bajaj.applyBreak();
	bajaj.soundHorn();
	bajaj.selfStart();
	
}
	

	
}
