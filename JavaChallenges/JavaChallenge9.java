package JavaChallenges;

public class JavaChallenge9 {

	/*
	 * Given a string s, find the first non-repeating character in it and return its
	 * index. If it does not exist, return -1.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "leetcode" Output: 0 
	 * Example 2:
	 * 
	 * Input: s = "loveleetcode" Output: 2 Example 3:
	 * 
	 * Input: s = "aabb" Output: -1
	 */

	public static void main(String[] args) {

		String str="leetcode";
		String str1="loveleetcode";
		String str2="aabb";
		JavaChallenge9 check=new JavaChallenge9();
		check.checkDistinct(str);
		check.checkDistinct(str1);
		check.checkDistinct(str2);

	}

	public void checkDistinct(String str) {

		{

			boolean flag = true;

			for(char i :str.toCharArray())
			{
				// if current character is the last occurrence in the string
				if (str.indexOf(i) == str.lastIndexOf(i))
				{
					System.out.println("First non-repeating character is: "+ i);
					System.out.println(str.indexOf(i));
					flag = false;
					break;
				}

			}
			if(flag) {
				System.out.println("There is no non repeating character in input string");
				System.out.println("-1");
			}
		}

	}
}
