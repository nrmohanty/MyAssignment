package week3.day2.homeassignment;

import java.util.Iterator;

public class Palindrome {
public static void main(String[] args) {
	
	
	//Declare A String value as"madam"
	
	String pldrome="madam";
	
	
	//Declare another String rev value as ""
	String rev="";
	
	for (int i = pldrome.length()-1; i >=0; i--) {
		
		char a=pldrome.charAt(i);
		
		
		rev=rev+a;
		if(rev.equals(pldrome))
		{
			
		System.out.println("The given string is a palendrim and it's " +  rev );
		}
		
	}
	
}
	
}
