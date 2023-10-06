package JavaChallenges;

public class JavaChallenge8 {

	/*
	 * Given an integer array nums and an integer k, return true if there are two
	 * distinct indices i and j in the array such that nums[i] == nums[j] and abs(i
	 * - j) <= k.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,2,3,1], k = 3 Output: true Example 2:
	 * 
	 * Input: nums = [1,0,1,1], k = 1 Output: true Example 3:
	 * 
	 * Input: nums = [1,2,3,1,2,3], k = 2 Output: false
	 */


	public static void main(String[] args) {

		int[] nums= {1,2,3,1};
		int[] nums1= {1,0,1,1};
		int[] nums2= {1,2,3,1,2,3};
		
		

		JavaChallenge8 check=new JavaChallenge8();
		check.checkArray(nums, 3);
		check.checkArray(nums1, 1);
		check.checkArray(nums2, 2);


	}

	public void checkArray(int[] nums,int k) {
		boolean result=false;

		for (int i = 0; i < nums.length; i++) 
		{
			for (int j = i+1; j < nums.length; j++) {

				if(nums[i] == nums[j] && Math.abs(i-j)<=k) {	
					result=true;
				}

			}
			
		}
		System.out.println("The given array result is  "+result);

	}


}





