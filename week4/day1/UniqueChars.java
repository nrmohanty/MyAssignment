package week4.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueChars {
	
	public static void main(String[] args) {
		
		String companyName = "google";
		System.out.println("The company name is "+companyName);
		
	char[] name=companyName.toCharArray();
	
	Set<Character> unique=new LinkedHashSet<>();
	
	for (char eachChar : name) {
		
		unique.add(eachChar);
	}
	
			System.out.println(unique);
			String output="";
			for (Character each : unique) {
				output=output+each;
				
			}
	System.out.println(output);
	
		
	}

}
