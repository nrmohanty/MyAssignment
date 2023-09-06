package week3.day2.homeassignment;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {
		
		//Declare String Input as Follow
		String test = "changeme";
		
			
		//Convert the String to character array
		
		test.toCharArray();
		char[] arr=test.toCharArray();
		
		//Traverse through each character (using loop)
		
		for (int i = arr.length - 1; i >= 0; i--) {
			
			if(i%2==1) {
				
			  
			        char a = (arr[i]);
			        char upperCase = Character.toUpperCase(a);
			        System.out.print(upperCase);
			       }
								
				
			
			}
			
		}
	}
	


