package week3.day2.homeassignment;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("This is Override depost rule :from AxisBank");
	}
	public static void main(String[] args) {
		
		AxisBank ab=new AxisBank();
		ab.deposit();
	}

}
