package JavaChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Javachallenge6 {
	public static void main(String[] args) {

		//		Given an array nums of size n, return the majority element.
		//
		//				The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
		//
		//				Example 1:
		//
		//				Input: nums = [3,2,3]
		//				Output: 3
		//				Example 2:
		//
		//				Input: nums = [2,2,1,1,1,2,2]
		//				Output: 2
		//		


		int[] nums = {3,2,3};
		int[] nums_ = { 2,2,1,1,1,2,2 };

		Javachallenge6 repetitive = new Javachallenge6();
		repetitive.findDistinct(nums);
		repetitive.findDistinct(nums_);

	}

	public void findDistinct(int[] nums) {
		int [] fr = new int [nums.length];  
		int visited = -1; 
		for(int i = 0; i < nums.length; i++){  
			int count = 1;  
			for(int j = i+1; j < nums.length; j++){  
				if(nums[i] == nums[j]){  
					count++;  
					//To avoid counting same element again  
					fr[j] = visited;  
				}  
			}  
			if(fr[i] != visited)  
				fr[i] = count;  
		}  

		//Displays the frequency of each element present in array  
		for(int i = 0; i < fr.length; i++){  
			if(fr[i] >nums.length/2)  
				System.out.println(nums[i]);  
		}  
	}
}