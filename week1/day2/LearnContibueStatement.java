package week1.day2;

public class LearnContibueStatement {
	public static void main(String[] args) {
		
		for (int i = 0; i <10; i++) {
			
			if (i==3) {
				System.out.println("Three");
				continue;//when the condition met then it will continue in the same iteration and it won't move to next iteration
				
				
			}	
			
			System.out.println(i);
		}
	}

}
