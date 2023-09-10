package week4.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		
		int[] nums= {8,3,5,6,3,7};
		
		
		Set<Integer> unique=new TreeSet<>();
		
		//add item
		for (int i = 0; i < nums.length; i++) {
			unique.add(nums[i]);
			
			
		}
		System.out.println(unique);
		
		
		
	}

}
