package week7.day1;

public class EmployeeDetail {

	int empid;
	String empname;
	static String companyName="TestLeaf";

	
	static {
		
		System.out.println("this is static block");
	}
	
	public void SetValue(int id,String ename,String cName) {

		empid=id;
		empname=ename;
		companyName=cName;


	}

	public static void emp(){

		System.out.println("add");
	}

	public void printValue() {
		System.out.println(empid +empname +companyName);
	}

	public static void main(String[] args) {

		EmployeeDetail emp=new EmployeeDetail();
		emp.SetValue(20, "Subraja", "TestLeaf");
		emp.printValue();

		emp.SetValue(20, "Vidya", "TestLeaf");
		emp.printValue();


	}

}
