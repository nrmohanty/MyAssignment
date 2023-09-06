package week3.day2.homeassignment;

public class Students {

	public void getStudentInfo() {
		
		System.out.println("This is to get the Student Info without pasing any arguments");
	}
	
	public void getStudentInfo(int id) {
		System.out.println("student id is "+id);
	}
	
	public void getStudentInfoint(int id,String name) {
		System.out.println("stsudent id is "+id + " and " + "student's name is "+name);
		
	}
	
	public void getStudentInfo(String email,int phoneno) {
		
		System.out.println("student email is "+email+ " and " + "student phone no is "+phoneno);
	}
	
	public static void main(String[] args) {
		
		Students std=new Students();
		std.getStudentInfo();
		std.getStudentInfo(11340);
		std.getStudentInfo("nihar@gmail.com", 988877888);
		std.getStudentInfoint(2356, "nihar2");
		
	}
}
