package week1.day2;

public class LearningBreakStatement {

	public static void main(String[] args) {
		
		for (int i = 1; i <10; i++) {
			
			if(i==3) {
				
				System.out.println("Three");
				break;//when the condition met then it will stop  in the same iteration and it won't move to next increment
				
			}
			
			System.out.println(i);
			
		}
	}
}
