package week3.day1.inheritance;

public class Audi extends Car {
	
	private void SunRoof() {
		// TODO Auto-generated method stub
		
		System.out.println("The sunroof from Audi");

	}

	public static void main(String[] args) {
		
		Audi audi=new Audi();
		audi.applyBreak();
		audi.applyGear();
		audi.SunRoof();
		audi.soundHorn();
	}
	
}
