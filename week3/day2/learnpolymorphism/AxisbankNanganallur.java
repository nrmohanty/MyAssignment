package week3.day2.learnpolymorphism;

public class AxisbankNanganallur extends Axisbank {
	
	public void knowYourCustomer() {
		System.out.println("aadhar");
		
	}

	public static void main(String[] args) {
		AxisbankNanganallur abn=new AxisbankNanganallur();
		abn.knowYourCustomer();
		abn.withDrawalLimit();
		
		Axisbank ab=new Axisbank();
		ab.knowYourCustomer();
		ab.withDrawalLimit();
	}
	
}
