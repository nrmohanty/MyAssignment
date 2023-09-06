package week3.day2.homeassignment;

public class ReverseEvenWords {
	
	public static void main(String[] args) {
		
		
		//Declare the input as Follow
		String test = "I am a software tester"; 
		
		// split the words and have it in an arra
		String[] test1=test.split(" ");
		
		String test2="";
		
		// Traverse through each word (using loop)
		
		for (int i = 0; i < test1.length; i++) {
			
			//odd position 
			if(i%2==1) {
				
				String test3[]=test1[i].split(" ");
				
				for (int j = test3.length-1; j >=0;  j--) {
					
					System.out.println(test3[j]+" ");
					//Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
				}
				
				}
			else if(i%2==0) {
				
				char test4[]=test1[i].toCharArray();
				
				
			}
			
		}
		
	}

}
