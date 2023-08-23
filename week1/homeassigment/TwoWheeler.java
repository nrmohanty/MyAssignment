package week1.homeassigment;

import week1.day2.LearnMethod;

public class TwoWheeler {
	
	public int  noOfWheels() {
		return 2;
		
	}
	
	public short noOfMirrors() {
		return 2;
		
	}
	
	public long  chassisNo() {
		return 28978789;
		
	}
	
	public boolean isPunctured() {
		return true;
	}
	
	public String bikeName() {
		return "HondaActiva";
		
	}
	
	public double   runningKM() {
		return 40.05;
		
	}
	
	public static void main(String[] args) {
		
		TwoWheeler tw=new TwoWheeler();
		System.out.println("The no of wheels are " + tw.noOfWheels());
		System.out.println("The no of mirrors are "+ tw.noOfMirrors());
		System.out.println("The chassis no is "+ tw.chassisNo());
		System.out.println("The tyre is punctured "+ tw.isPunctured());
		System.out.println("The bike name is "+ tw.bikeName());
		System.out.println("The bike milage is "+ tw.runningKM());
		
	}
	

}
