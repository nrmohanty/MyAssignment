package JavaChallenges;

public class JavaChallenge3 {

	//	A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

	//	Given a string s, return true if it is a palindrome, or false otherwise.
	//
	//	 
	//
	//	Example 1:
	//
	//	Input: s = "A man, a plan, a canal: Panama"
	//	Output: true
	//	Explanation: "amanaplanacanalpanama" is a palindrome.
	//	Example 2:
	//
	//	Input: s = "race a car"
	//	Output: false
	//	Explanation: "raceacar" is not a palindrome.
	//	Example 3:
	//
	//	Input: s = " "
	//	Output: true
	//	Explanation: s is an empty string "" after removing non-alphanumeric characters.
	//	Since an empty string reads the same forward and backward, it is a palindrome.

	public static void main(String[] args) {

		String input1="A man, a plan, a canal: Panama";
		String input1_1=input1.replaceAll("\\W", "");
		String input1_2=input1_1.toLowerCase();
		System.out.println(input1_2);

		String input2="race a car";
		String input2_1=input2.replaceAll("\\W", "");

		System.out.println(input2_1);

		String input3=" ";

		JavaChallenge3 checkString=new JavaChallenge3();
		checkString.palindromeCheck(input1_2);
		checkString.palindromeCheck(input2_1);
		checkString.palindromeCheck(input3);



	}

	public void palindromeCheck(String input) {

		String rev="";

		for (int i = input.length()-1; i >=0; i--) {

			char a=input.charAt(i);

			rev=rev+a;
			
			}
		if(rev.equals(input))
		{

			System.out.println("true");
			
		}
		else {
			System.out.println("false");

		}
	}

}
