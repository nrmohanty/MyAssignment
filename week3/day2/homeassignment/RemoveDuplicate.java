package week3.day2.homeassignment;

import java.util.Iterator;

public class RemoveDuplicate {
public static void main(String[] args) {
	
	//Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";
	
		
	//Split the String into array and iterate over it
	String[] value=text.split(" ");
	
	
	String replacedtext="";
 
	for (int i = 0; i < value.length; i++) {
				
		//Initialize another loop to check whether the word is there in the array
		
		for (int j = i+1; j < value.length; j++) 
		{
			if(value[i].equals(value[j])) {
			
			
			replacedtext=text.replaceAll(value[i],"");
			break;
          
			}
					
		
			}
		
		
			
		}
	System.out.println(replacedtext);
	}
}
	
	

