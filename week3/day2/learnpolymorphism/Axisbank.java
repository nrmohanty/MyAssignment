package week3.day2.learnpolymorphism;

public class Axisbank implements RBI{

	@Override
	public void knowYourCustomer() {
		System.out.println("aadhar");
		
	}

	@Override
	public void withDrawalLimit() {
		System.out.println("40000");
		
	}

}
