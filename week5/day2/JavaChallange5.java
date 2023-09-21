package week5.day2;

import java.util.Iterator;
import java.util.Scanner;

public class JavaChallange5 {
//	Write an algorithm to determine if a number n is happy.
//
//	A happy number is a number defined by the following process:
//
//	Starting with any positive integer, replace the number by the sum of the squares of its digits.
//	Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//	Those numbers for which this process ends in 1 are happy.
//	Return true if n is a happy number, and false if not.
//
//	 
//
//	Example 1:
//
//	Input: n = 19
//	Output: true
//	Explanation:
//	12 + 92 = 82
//	82 + 22 = 68
//	62 + 82 = 100
//	12 + 02 + 02 = 1
//	Example 2:
//
//	Input: n = 2
//	Output: false
			   		    
			    public static void main(String[] args) {
			        // Pass the number 
			        Scanner sc = new Scanner(System.in);
			        System.out.print("Enter a number greater than 0:");
			        int num = sc.nextInt();
			        int finalVal = num;
			        while (finalVal != 1 && finalVal != 4) {
			            finalVal = isNumHappy(finalVal);
			        }
			        if (finalVal == 1) {
			            System.out.println("The number entered is a Happy Number");
			        } else {
			            System.out.println(" The number entered is not a Happy Number");
			        }
			    }
			
			    public static int isNumHappy(int num) {
			        int rem = 0, sum = 0;
			        // calculate the sum of squares of each digit
			        while (num > 0) {
			            rem = num % 10;
			            sum = sum + (rem * rem);
			            num = num / 10;
			        }
			        return sum;
			    }
		
	}


