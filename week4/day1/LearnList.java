package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		//Declare a list
		//List name <generic type> listname =new implemetaion class<>;
		List<String> mentors=new ArrayList<>();
		//Add items into a list
		mentors.add("Arvind");
		mentors.add("Vidya");
		mentors.add("Ragu");
		mentors.add(2, "Text");
		
		System.out.println(mentors);
		//find the size of the list
		int listsize=mentors.size();
		//print the size
		System.out.println("list of size is"+listsize);
		
		
		//print the array
		System.out.println(mentors);
		
		//remove an item from the list
		mentors.remove(3);
		System.out.println(mentors);
		
		//to retrieve a particular item from the list 
		String value=mentors.get(4);
		System.out.println(value);
		
		//to clear a list
		
		mentors.clear();
		System.out.println(mentors);
		System.out.println(mentors.isEmpty());
		
		
	}

}
