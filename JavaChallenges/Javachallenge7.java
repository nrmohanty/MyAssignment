package JavaChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Javachallenge7 {
	public static void main(String[] args) {
		
//		Java Problem (7/20)
//
//		Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//		Example 1:
//
//		Input: nums = [1,2,3,1]
//		Output: true
//		Example 2:
//
//		Input: nums = [1,2,3,4]
//		Output: false
//		Example 3:
//
//		Input: nums = [1,1,1,3,3,4,3,2,4,2]
//		Output: true
		
		
		int[] nums = { 1, 2, 3, 1 };
		int[] nums_ = { 1, 2, 3, 4 };
		int[] nums_1 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		Javachallenge7 repetitive = new Javachallenge7();
		repetitive.findDistinct(nums);
		repetitive.findDistinct(nums_);
		repetitive.findDistinct(nums_1);

	}

	public void findDistinct(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {

			for (int j = 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && i != j) {
					count++;
				}

			}

		}
		if (count >= 1) {
			System.out.println("true");
		} else
			System.out.println("false");

	}

}