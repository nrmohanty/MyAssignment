package week4.day1.homeassignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollection {
	public static void main(String[] args) {
		
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)	
		String[] cname= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		
		// get the length of the array	
		int length=cname.length;
		System.out.println("The length of array is"+length);
	
		// sort the array
		Set<String> setcname=new TreeSet<>();
		
		for (int i = length-1; i >=0; i--) {
			
			setcname.add(cname[i]);
			
		}
		System.out.println("Before reversing : "+setcname);
		
		//putting strings into a List
		List<String> listcname=new ArrayList<>(setcname);
		
		//reversing the string array
		Collections.reverse(listcname);
		System.out.println("After reversing: "+listcname);
			
		
		
		
	}

}
