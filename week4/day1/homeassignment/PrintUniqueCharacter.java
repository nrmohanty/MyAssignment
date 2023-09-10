package week4.day1.homeassignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	
	public static void main(String[] args) {
		
		String name="Nihar Ranjan Mohanty";
		String name1=name.toLowerCase();
		char[] chars=name1.toCharArray();
		
		Set<Character> setchars=new LinkedHashSet<>();
		for (int i = 0; i < chars.length; i++) {
			setchars.add(chars[i]);
		}
		
		System.out.println(setchars);
		
		String output="";
		for (Character each : setchars) {
			output=output+" "+each;
			
		}
		
		//Print the Set values which is having unique words without the comma	
		System.out.println(output);
		
	}
	
	
	

}
