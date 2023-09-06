package week3.day1.inheritance;

public class BMW extends Car{
	
	private void airBag()  {
		// TODO Auto-generated method stub
		
		System.out.println("air bag from BMW class");

	}
	public static void main(String[] args) {
		BMW bmw=new BMW();
		bmw.applyBreak();
		bmw.airBag();
		bmw.soundHorn();
		bmw.applyGear();
	}
	
	

}
