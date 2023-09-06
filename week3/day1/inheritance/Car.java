package week3.day1.inheritance;

public class Car extends Vehicle {

	public void applyGear() {
		// TODO Auto-generated method stub
		System.out.println("Gear applied from Gear class");

	}
	
	public static void main(String[] args) {
		
		Car car=new Car();
		car.applyBreak();
		car.applyGear();
		car.soundHorn();
		
	}
}
