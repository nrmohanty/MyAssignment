package JavaChallenges;

public class JavaChallenge2 {
	
//	Given a non-negative integer x, compute and return the square root of x.
//
//			Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
//
//			Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
//
//			 
//
//			Example 1:
//
//			Input: x = 4
//			Output: 2
//			Example 2:
//
//			Input: x = 8
//			Output: 2
//			Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

	public static void main(String[] args) {
		int input1=4;
		int input2=8;
		
		JavaChallenge2 sqrt=new JavaChallenge2();
		
		sqrt.sqaureroot(input1);
		sqrt.sqaureroot(input2);
	}
	
	public void sqaureroot(int input) {
		//square root is always a double no
		double sqrt1=Math.sqrt(input);
		//to convert double to int
		int value=(int)sqrt1;
		System.out.println("The square root of the number is "+value);
		
		
	}
	
	
	
	
}
