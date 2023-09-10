package week4.day1.homeassignment;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class RemovingDuplicateWord {
public static void main(String[] args) {
	
	//Use the declared String text as input
	String text="We learn java basics as part of java sessions in java week1";
	
	//Split the String based on white spaces and save as String Array ,Then iterate the Array
	String[] text1=text.split(" ");
	
	//Create a empty Set 		
	Set<String> settext=new TreeSet<>();
	
	//iterate the String array
	for (int i = 0; i < text1.length; i++) {
		
		//add each word into Set
		settext.add(text1[i]);
	}
	//Print the Set values which is having unique words
	System.out.println(settext);
	
	String output="";
	for (String each : settext) {
		output=output+" "+each;
		
	}
	//Print the Set values which is having unique words without the comma	
System.out.println(output);

}
}