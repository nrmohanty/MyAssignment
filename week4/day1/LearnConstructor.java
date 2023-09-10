package week4.day1;

public class LearnConstructor {
	int empid;
	String empName;
	boolean empStatus;
	
	public LearnConstructor() {
		//this(300,"Nihar1",true);
		empid=100;
		System.out.println("Default constructor");
		
	}
	
	public LearnConstructor(int empid,String empName,boolean empstatus) {
		
		this.empid=empid;
		this.empName=empName;
		this.empStatus=empstatus;
		System.out.println("parametrized constructor");
		
	}
	public static void main(String[] args) {
		
		LearnConstructor lc=new LearnConstructor(200,"Nihar1",true);
		
		System.out.println(lc.empid +" " + lc.empName + lc.empStatus);
		
		
	}

}
