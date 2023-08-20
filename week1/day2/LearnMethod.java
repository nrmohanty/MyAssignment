package week1.day2;

public class LearnMethod {
	
	//accessmodifier returntype method name input argumnets
	public int  getCycleCount() {
		return 2;
		
	}
	
	public String getCyclecolor(int brandnum,String color) {
		return brandnum + " " + color;
		
	}
	
	public int addTwoNumbers(int num1,int num2) {
		return num1+num2;
	}
	
	public void getOtp() {
		System.out.println("No");
	}
	
	public static void main(String[] args) {
		
		LearnMethod bc=new LearnMethod();
		System.out.println(bc.getCycleCount());
		System.out.println(bc.getCyclecolor(4567, "Red"));
		bc.getOtp();
		System.out.println(bc.addTwoNumbers(20, 30));
	}
	

}
